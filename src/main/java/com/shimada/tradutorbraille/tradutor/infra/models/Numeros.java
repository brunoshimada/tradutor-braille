package com.shimada.tradutorbraille.tradutor.infra.models;

public enum Numeros {

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

    Numeros(int codigo) {
        this.codigo = (char) codigo;
    }

    private char getCodigo() {
        return codigo;
    }

    public static char numero() {
        return Numeros.NUMERO.getCodigo();
    }

    public static char getCodigo(String input) {
        final String enumToValidate = parseToStringEnum(input);

        try {
            final Numeros numeros = Numeros.valueOf(enumToValidate);
            return numeros.getCodigo();
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Nao foi possível traduzir");
        }
    }

    private static String parseToStringEnum(String input) {
        final int integer = Integer.parseInt(input);

        switch (integer) {
            case 0: {
                return "ZERO";
            }
            case 1: {
                return "UM";
            }
            case 2: {
                return "DOIS";
            }
            case 3: {
                return "TRES";
            }
            case 4: {
                return "QUATRO";
            }
            case 5: {
                return "CINCO";
            }
            case 6: {
                return "SEIS";
            }
            case 7: {
                return "SETE";
            }
            case 8: {
                return "OITO";
            }
            case 9: {
                return "NOVE";
            }
            default:{
                throw new RuntimeException("AAAAA");
            }
        }
    }
}
