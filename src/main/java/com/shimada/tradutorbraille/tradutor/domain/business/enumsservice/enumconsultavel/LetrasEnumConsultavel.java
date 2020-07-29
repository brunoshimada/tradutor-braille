package com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel;

import com.shimada.tradutorbraille.tradutor.infra.models.enums.LetrasEnum;

import org.springframework.stereotype.Service;

@Service
public class LetrasEnumConsultavel implements IEnumConsultavel {

    @Override
    public char getCodigo(String letra) {
        try {
            final LetrasEnum letrasEnum = LetrasEnum.valueOf(letra.toUpperCase());
            return letrasEnum.getCodigo();
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Nao foi possível traduzir");
        }
    }

    public char uppercase() {
        return LetrasEnum.UPPERCASE.getCodigo();
    }
}
