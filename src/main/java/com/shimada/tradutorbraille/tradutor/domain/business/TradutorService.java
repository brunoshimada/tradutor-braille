package com.shimada.tradutorbraille.tradutor.domain.business;

import com.shimada.tradutorbraille.tradutor.web.form.TradutorForm;

import org.springframework.stereotype.Service;

@Service
public class TradutorService {

    public String traduzirTexto(TradutorForm tradutorForm) {
        return tradutorForm.getTextoParaTraduzir();
    }
}
