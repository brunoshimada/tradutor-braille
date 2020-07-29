package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel.EspeciaisEnumConsultavel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Order(Ordered.HIGHEST_PRECEDENCE)
public class EspecialStrategy implements IInterpretadorString {

    private final EspeciaisEnumConsultavel especiaisEnumConsultavel;

    @Autowired
    public EspecialStrategy(EspeciaisEnumConsultavel especiaisEnumConsultavel) {
        this.especiaisEnumConsultavel = especiaisEnumConsultavel;
    }


    @Override
    public boolean isSatisfiedBy(String input) {
        return especiaisEnumConsultavel.isPossivel(input);
    }

    @Override
    public List<Character> obter(String input) {
        return List.of(especiaisEnumConsultavel.getCodigo(input));
    }
}
