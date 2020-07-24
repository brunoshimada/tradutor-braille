package com.shimada.tradutorbraille.tradutor.infra.models;

public enum Especiais {

    PONTO(10290),
    VIRGULA(10242),
    PONTO_E_VIRGULA(10246),
    INTERROGACAO(10274),
    EXCLAMACAO(10262),
    HIFEN(10276),
    ASPAS(10278),
    PARENTESE_ABERTURA(10275),
    PARENTESE_FECHAMENTO(10268),
    PARENTESE_LETRA_COMPLEMENTO(10244);

    private final char codigo;

    Especiais(int codigo) {
        this.codigo = (char) codigo;
    }

    private char getCodigo() {
        return codigo;
    }

    public static boolean isPossivel(String input) {
        final String cadastrados = ".,;?!-\"()";
        return cadastrados.contains(input);
    }

    public static char getComplemento() {
        return Especiais.PARENTESE_LETRA_COMPLEMENTO.getCodigo();
    }

    public static char getCodigo(String input) {
        final String enumToValidate = parseToStringEnum(input);

        try {
            final Especiais especiais = Especiais.valueOf(enumToValidate);
            return especiais.getCodigo();
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("AAAAAAAAAAAAAA");
        }
    }

    private static String parseToStringEnum(String input) {
        switch (input) {
            case ".": {
                return "PONTO";
            }
            case ",": {
                return "VIRGULA";
            }
            case ";": {
                return "PONTO_E_VIRGULA";
            }
            case "?": {
                return "INTERROGACAO";
            }
            case "!": {
                return "EXCLAMACAO";
            }
            case "-": {
                return "HIFEN";
            }
            case "\"": {
                return "ASPAS";
            }
            case "(": {
                return "PARENTESE_ABERTURA";
            }
            case ")": {
                return "PARENTESE_FECHAMENTO";
            }
            default: {
                throw new RuntimeException("AAAAAAAAA");
            }
        }
    }

}
