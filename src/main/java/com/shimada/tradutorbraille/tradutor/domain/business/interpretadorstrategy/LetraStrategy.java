package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.EnumService;
import com.shimada.tradutorbraille.tradutor.infra.models.DetailedTranslatedCharacter;
import com.shimada.tradutorbraille.tradutor.validator.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LetraStrategy implements IInterpretadorString {

    private final Validator validator;
    private final EnumService enumService;

    @Autowired
    public LetraStrategy(Validator validator, EnumService enumService) {
        this.validator = validator;
        this.enumService = enumService;
    }

    @Override
    public boolean isSatisfiedBy(String input) {
        boolean isNotEspecial = enumService.isPossivelTraduzirCaracterEspecial(input);
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException numberFormatException) {
            if (!isNotEspecial) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<DetailedTranslatedCharacter> obter(String input) {
        List<DetailedTranslatedCharacter> output = new ArrayList<>();

        if (validator.isUpperCase(input)) {
            output.add(DetailedTranslatedCharacter.obter("Identificado de maiúsculo", enumService.getIdentificadorUppercase()));
        }

        output.add(DetailedTranslatedCharacter.obter(input, enumService.getCodigoLetra(input)));

        return output;
    }
}
