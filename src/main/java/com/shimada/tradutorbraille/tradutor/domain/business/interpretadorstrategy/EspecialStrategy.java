package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import com.shimada.tradutorbraille.tradutor.infra.models.Especiais;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Order(Ordered.HIGHEST_PRECEDENCE)
public class EspecialStrategy implements IInterpretadorString {

    @Override
    public boolean isSatisfiedBy(String input) {
        return Especiais.isPossivel(input);
    }

    @Override
    public List<Character> obter(String input) {
        return List.of(Especiais.getCodigo(input));
    }
}
