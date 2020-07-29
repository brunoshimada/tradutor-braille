package com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel;

import com.shimada.tradutorbraille.tradutor.infra.models.enums.EspeciaisEnum;

import org.springframework.stereotype.Service;

@Service
public class EspeciaisEnumConsultavel implements IEnumConsultavel {

    @Override
    public char getCodigo(String input) {
        final String enumToValidate = parseToStringEnum(input);

        try {
            final EspeciaisEnum especiaisEnum = EspeciaisEnum.valueOf(enumToValidate);
            return especiaisEnum.getCodigo();
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

    public boolean isPossivel(String input) {
        final String cadastrados = ".,;?!-\"()";
        return cadastrados.contains(input);
    }

    public char getComplemento() {
        return EspeciaisEnum.PARENTESE_LETRA_COMPLEMENTO.getCodigo();
    }
}
