package com.shimada.tradutorbraille.tradutor.domain.business.interpretadorstrategy;

import java.util.List;

public interface IInterpretadorString {

    boolean isSatisfiedBy(String input);
    List<Character> obter(String input);
}
