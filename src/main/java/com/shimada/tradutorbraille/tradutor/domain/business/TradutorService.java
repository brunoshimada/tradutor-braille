package com.shimada.tradutorbraille.tradutor.domain.business;

import com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy.IInterpretadorString;
import com.shimada.tradutorbraille.tradutor.web.form.TradutorForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TradutorService {

    private final List<IInterpretadorString> interpretadorStringStrategies;

    @Autowired
    public TradutorService(List<IInterpretadorString> interpretadorStringStrategies) {
        this.interpretadorStringStrategies = interpretadorStringStrategies;
    }

    public List<Character> traduzirTexto(TradutorForm tradutorForm) {
        final String textoParaTraduzir = tradutorForm.getTextoParaTraduzir();
        final List<Character> characterList = textoParaTraduzir.chars()
                                                  .mapToObj(c -> (char) c)
                                                  .collect(Collectors.toList());
        return traduzir(characterList);
    }

    private List<Character> traduzir(List<Character> textoParaTraduzir) {
        final List<Character> textoTraduzido = new ArrayList<>();

        for (Character character : textoParaTraduzir) {
            final String characterAsString = character.toString();

            interpretadorStringStrategies.stream()
                .filter(strategy -> strategy.isSatisfiedBy(characterAsString))
                .forEach(strategy -> {
                    textoTraduzido.addAll(strategy.obter(characterAsString));
                });
        }

        return textoTraduzido;
    }
}
