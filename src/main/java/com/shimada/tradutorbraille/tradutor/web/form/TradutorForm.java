package com.shimada.tradutorbraille.tradutor.web.form;

import javax.validation.constraints.NotBlank;

public class TradutorForm {

    @NotBlank(message = "{texto.notempty}")
    private String textoParaTraduzir;

    public String getTextoParaTraduzir() {
        return textoParaTraduzir;
    }

    public void setTextoParaTraduzir(String textoParaTraduzir) {
        this.textoParaTraduzir = textoParaTraduzir;
    }
}
