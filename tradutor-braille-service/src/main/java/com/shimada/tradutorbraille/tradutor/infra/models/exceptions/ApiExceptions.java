package com.shimada.tradutorbraille.tradutor.infra.models.exceptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ApiExceptions {

    private String timestamp;
    private Integer status;
    private String error;
    private String message;

    private ApiExceptions(Integer status, String error, String message) {
        timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        this.status = status;
        this.error = error;
        this.message = message;
    }

    public static ApiExceptions obter(Integer status, String error, String message) {
        return new ApiExceptions(status, error, message);
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}
