package com.shimada.tradutorbraille.tradutor.web.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.shimada.tradutorbraille.tradutor.infra.models.DetailedTranslatedCharacter;

import java.util.List;
import java.util.stream.Collectors;

public class TradutorView {

    @JsonProperty("caracteresTraduzidos")
    private List<Character> characterList;

    private TradutorView(List<Character> characterList) {
        this.characterList = characterList;
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public static TradutorView toView(List<DetailedTranslatedCharacter> characterList) {
        final List<Character> mapearSimplificado = characterList.stream().map(DetailedTranslatedCharacter::getCharCode).collect(Collectors.toList());
        return new TradutorView(mapearSimplificado);
    }

}
