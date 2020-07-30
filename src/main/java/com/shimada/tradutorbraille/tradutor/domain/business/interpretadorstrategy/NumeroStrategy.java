package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.EnumService;
import com.shimada.tradutorbraille.tradutor.infra.models.DetailedTranslatedCharacter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumeroStrategy implements IInterpretadorString {

    private final EnumService enumService;

    @Autowired
    public NumeroStrategy(EnumService enumService) {
        this.enumService = enumService;
    }

    @Override
    public boolean isSatisfiedBy(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    @Override
    public List<DetailedTranslatedCharacter> obter(String input) {
        List<DetailedTranslatedCharacter> output = new ArrayList<>();

        output.add(DetailedTranslatedCharacter.obter("Identificador de número", enumService.getIdentificadorNumero()));
        output.add(DetailedTranslatedCharacter.obter(input, enumService.getCodigoNumero(input)));

        return output;
    }
}
