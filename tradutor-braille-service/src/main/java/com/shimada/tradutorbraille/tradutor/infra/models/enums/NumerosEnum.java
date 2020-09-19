package com.shimada.tradutorbraille.tradutor.infra.models.enums;

public enum NumerosEnum {

    NUMERO(10300),
    UM(10241),
    DOIS(10243),
    TRES(10249),
    QUATRO(10265),
    CINCO(10257),
    SEIS(10251),
    SETE(10267),
    OITO(10259),
    NOVE(10250),
    ZERO(10266);

    private final char codigo;

    NumerosEnum(int codigo) {
        this.codigo = (char) codigo;
    }

    public char getCodigo() {
        return codigo;
    }
}
