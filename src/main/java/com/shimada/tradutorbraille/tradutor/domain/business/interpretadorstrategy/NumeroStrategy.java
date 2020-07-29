package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.EnumService;

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
            Integer attempt = Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    @Override
    public List<Character> obter(String input) {
        List<Character> output = new ArrayList<>();

        output.add(enumService.getIdentificadorNumero());
        output.add(enumService.getCodigoNumero(input));

        return output;
    }
}
