package com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel;

public interface IEnumConsultavel {

    char getCodigo(String input);

    default String getExceptionMessage() {
        return "Caracter {0} nao suportado pela aplicação";
    }
}
