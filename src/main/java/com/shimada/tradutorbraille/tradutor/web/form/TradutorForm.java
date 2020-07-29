package com.shimada.tradutorbraille.tradutor.web.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class TradutorForm {

    @NotBlank(message = "Texto não pode ser vazio!")
    @NotNull(message = "Texto não pode ser null!")
    private String textoParaTraduzir;

    public String getTextoParaTraduzir() {
        return textoParaTraduzir;
    }

    public void setTextoParaTraduzir(String textoParaTraduzir) {
        this.textoParaTraduzir = textoParaTraduzir;
    }
}
