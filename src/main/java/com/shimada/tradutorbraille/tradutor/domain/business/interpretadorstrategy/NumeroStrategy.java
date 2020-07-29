package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel.NumerosEnumConsultavel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumeroStrategy implements IInterpretadorString {

    private final NumerosEnumConsultavel numerosEnumConsultavel;

    @Autowired
    public NumeroStrategy(NumerosEnumConsultavel numerosEnumConsultavel) {
        this.numerosEnumConsultavel = numerosEnumConsultavel;
    }

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

        output.add(numerosEnumConsultavel.numero());
        output.add(numerosEnumConsultavel.getCodigo(input));

        return output;
    }
}
