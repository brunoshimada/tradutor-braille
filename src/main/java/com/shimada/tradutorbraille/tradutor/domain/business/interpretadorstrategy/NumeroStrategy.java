package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import com.shimada.tradutorbraille.tradutor.infra.models.Numeros;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumeroStrategy implements IInterpretadorString {

    @Override
    public boolean isSatisfiedBy(String input) {
        try {
            Integer attempt = Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    @Override
    public List<Character> obter(String input) {
        List<Character> output = new ArrayList<>();

        output.add(Numeros.numero());
        output.add(Numeros.getCodigo(input));

        return output;
    }
}
