package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import com.shimada.tradutorbraille.tradutor.infra.models.Especiais;
import com.shimada.tradutorbraille.tradutor.infra.models.Letras;
import com.shimada.tradutorbraille.tradutor.validator.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LetraStrategy implements IInterpretadorString {

    private final Validator validator;

    @Autowired
    public LetraStrategy(Validator validator) {
        this.validator = validator;
    }

    @Override
    public boolean isSatisfiedBy(String input) {
        boolean isNotEspecial = Especiais.isPossivel(input);
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
            output.add(Letras.uppercase());
        }

        output.add(Letras.getCodigo(input));

        return output;
    }
}
