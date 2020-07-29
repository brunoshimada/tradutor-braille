package com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel;

import com.shimada.tradutorbraille.tradutor.domain.business.exceptions.NaoPodeConverterException;
import com.shimada.tradutorbraille.tradutor.infra.models.enums.LetrasEnum;

import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
public class LetrasEnumConsultavel implements IEnumConsultavel {

    @Override
    public char getCodigo(String letra) {
        try {
            final LetrasEnum letrasEnum = LetrasEnum.valueOf(letra.toUpperCase());
            return letrasEnum.getCodigo();
        } catch (IllegalArgumentException e) {
            throw new NaoPodeConverterException(MessageFormat.format("Caracter {0} nao suportado pela aplicação", letra));
        }
    }

    public char uppercase() {
        return LetrasEnum.UPPERCASE.getCodigo();
    }
}
