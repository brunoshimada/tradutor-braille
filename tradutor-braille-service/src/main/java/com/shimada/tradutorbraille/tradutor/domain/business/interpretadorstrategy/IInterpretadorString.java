package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import com.shimada.tradutorbraille.tradutor.infra.models.DetailedTranslatedCharacter;

import java.util.List;

public interface IInterpretadorString {

    boolean isSatisfiedBy(String input);
    List<DetailedTranslatedCharacter> obter(String input);
}
