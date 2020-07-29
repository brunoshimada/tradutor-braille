package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel.EspeciaisEnumConsultavel;
import com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel.LetrasEnumConsultavel;
import com.shimada.tradutorbraille.tradutor.validator.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LetraStrategy implements IInterpretadorString {

    private final Validator validator;
    
    private final EspeciaisEnumConsultavel especiaisEnumConsultavel;
    private final LetrasEnumConsultavel letrasEnumConsultavel;

    @Autowired
    public LetraStrategy(Validator validator, EspeciaisEnumConsultavel especiaisEnumConsultavel, LetrasEnumConsultavel letrasEnumConsultavel) {
        this.validator = validator;
        this.especiaisEnumConsultavel = especiaisEnumConsultavel;
        this.letrasEnumConsultavel = letrasEnumConsultavel;
    }

    @Override
    public boolean isSatisfiedBy(String input) {
        boolean isNotEspecial = especiaisEnumConsultavel.isPossivel(input);
        try {
            Double attempt = Double.parseDouble(input);
        } catch (NumberFormatException numberFormatException) {
            if (!isNotEspecial) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Character> obter(String input) {
        List<Character> output = new ArrayList<>();

        if (validator.isUpperCase(input)) {
            output.add(letrasEnumConsultavel.uppercase());
        }

        output.add(letrasEnumConsultavel.getCodigo(input));

        return output;
    }
}
