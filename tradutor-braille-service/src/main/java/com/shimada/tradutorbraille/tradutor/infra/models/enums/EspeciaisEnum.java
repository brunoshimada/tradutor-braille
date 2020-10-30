package com.shimada.tradutorbraille.tradutor.infra.models.enums;

public enum EspeciaisEnum {

    PONTO(10290),
    VIRGULA(10242),
    PONTO_E_VIRGULA(10246),
    INTERROGACAO(10274),
    EXCLAMACAO(10262),
    HIFEN(10276),
    ASPAS(10278),
    PARENTESE_ABERTURA(10275),
    PARENTESE_FECHAMENTO(10268),
    PARENTESE_LETRA_COMPLEMENTO(10244),
    ESPACO(10240);

    private final char codigo;

    EspeciaisEnum(int codigo) {
        this.codigo = (char) codigo;
    }

    public char getCodigo() {
        return codigo;
    }
}
