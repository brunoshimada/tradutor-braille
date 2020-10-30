package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.EnumService;
import com.shimada.tradutorbraille.tradutor.infra.models.DetailedTranslatedCharacter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Order(Ordered.HIGHEST_PRECEDENCE)
public class EspecialStrategy implements IInterpretadorString {

    private final EnumService enumService;

    @Autowired
    public EspecialStrategy(EnumService enumService) {
        this.enumService = enumService;
    }

    @Override
    public boolean isSatisfiedBy(String input) {
        return enumService.isPossivelTraduzirCaracterEspecial(input);
    }

    @Override
    public List<DetailedTranslatedCharacter> obter(String input) {
        var inputHelpr = input.equals(" ") ? "espaço" : input;

        return List.of(DetailedTranslatedCharacter.obter(inputHelpr, enumService.getCodigoCaracterEspecial(input)));
    }
}
