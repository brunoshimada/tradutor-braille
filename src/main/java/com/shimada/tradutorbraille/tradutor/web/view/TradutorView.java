package com.shimada.tradutorbraille.tradutor.web.view;

public class TradutorView {

    private String textoTraduzido;

    private TradutorView(String textoTraduzido) {
        this.textoTraduzido = textoTraduzido;
    }

    public String getTextoTraduzido() {
        return textoTraduzido;
    }

    public static TradutorView toView(String textoTraduzido) {
        return new TradutorView(textoTraduzido);
    }

}
