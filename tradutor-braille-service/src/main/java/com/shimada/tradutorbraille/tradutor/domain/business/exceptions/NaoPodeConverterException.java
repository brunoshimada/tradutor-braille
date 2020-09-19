package com.shimada.tradutorbraille.tradutor.domain.business.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NaoPodeConverterException extends RuntimeException {

    public NaoPodeConverterException(String message) {
        super(message);
    }
}
