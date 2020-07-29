package com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel;

import com.shimada.tradutorbraille.tradutor.domain.business.exceptions.NaoPodeConverterException;
import com.shimada.tradutorbraille.tradutor.infra.models.enums.NumerosEnum;

import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
public class NumerosEnumConsultavel implements IEnumConsultavel {

    @Override
    public char getCodigo(String input) {
        final String enumToValidate = parseToStringEnum(input);

        try {
            final NumerosEnum numerosEnum = NumerosEnum.valueOf(enumToValidate);
            return numerosEnum.getCodigo();
        } catch (IllegalArgumentException e) {
            throw new NaoPodeConverterException(MessageFormat.format("Caracter {0} nao suportado pela aplicação", input));
        }
    }

    public char numero() {
        return NumerosEnum.NUMERO.getCodigo();
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
                throw new NaoPodeConverterException(MessageFormat.format("Caracter {0} nao suportado pela aplicação", input));
            }
        }
    }
}
