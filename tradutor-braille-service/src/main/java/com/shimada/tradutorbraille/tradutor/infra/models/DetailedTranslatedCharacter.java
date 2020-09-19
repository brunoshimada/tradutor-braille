package com.shimada.tradutorbraille.tradutor.infra.models;

public class DetailedTranslatedCharacter {

    private String originalInput;
    private Character charCode;
    private String charCodeAsString;

    private DetailedTranslatedCharacter(String originalInput, Character charCode) {
        this.originalInput = originalInput;
        this.charCode = charCode;
        this.charCodeAsString = getCharValueAsString(charCode);
    }

    public static DetailedTranslatedCharacter obter(String originalInput, Character charCode) {
        return new DetailedTranslatedCharacter(originalInput, charCode);
    }

    public String getOriginalInput() {
        return originalInput;
    }

    public Character getCharCode() {
        return charCode;
    }

    public String getCharCodeAsString() {
        return charCodeAsString;
    }

    private String getCharValueAsString(Character character) {
        final int charValue = character;
        return String.valueOf(charValue);
    }
}
