package com.shimada.tradutorbraille.tradutor.domain.business.enumsservice;

import com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel.EspeciaisEnumConsultavel;
import com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel.LetrasEnumConsultavel;
import com.shimada.tradutorbraille.tradutor.domain.business.enumsservice.enumconsultavel.NumerosEnumConsultavel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnumService {

    private final NumerosEnumConsultavel numerosEnumConsultavel;
    private final LetrasEnumConsultavel letrasEnumConsultavel;
    private final EspeciaisEnumConsultavel especiaisEnumConsultavel;

    @Autowired
    public EnumService(NumerosEnumConsultavel numerosEnumConsultavel, LetrasEnumConsultavel letrasEnumConsultavel, EspeciaisEnumConsultavel especiaisEnumConsultavel) {
        this.numerosEnumConsultavel = numerosEnumConsultavel;
        this.letrasEnumConsultavel = letrasEnumConsultavel;
        this.especiaisEnumConsultavel = especiaisEnumConsultavel;
    }

    public char getIdentificadorNumero() {
        return numerosEnumConsultavel.numero();
    }

    public char getCodigoNumero(String input) {
        return numerosEnumConsultavel.getCodigo(input);
    }

    public boolean isPossivelTraduzirCaracterEspecial(String input) {
        return especiaisEnumConsultavel.isPossivel(input);
    }

    public char getCodigoCaracterEspecial(String input) {
        return especiaisEnumConsultavel.getCodigo(input);
    }

    public char getIdentificadorUppercase() {
        return letrasEnumConsultavel.uppercase();
    }

    public char getCodigoLetra(String input) {
        return letrasEnumConsultavel.getCodigo(input);
    }
}
