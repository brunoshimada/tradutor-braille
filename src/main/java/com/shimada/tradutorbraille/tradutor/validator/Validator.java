package com.shimada.tradutorbraille.tradutor.validator;

import org.springframework.stereotype.Service;

@Service
public class Validator {

    public boolean isUpperCase(String input) {
        return input.equals(input.toUpperCase());
    }
}
