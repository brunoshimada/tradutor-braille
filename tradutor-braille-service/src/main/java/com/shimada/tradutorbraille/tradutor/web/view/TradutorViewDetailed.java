package com.shimada.tradutorbraille.tradutor.web.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.shimada.tradutorbraille.tradutor.infra.models.DetailedTranslatedCharacter;

import java.util.List;

public class TradutorViewDetailed {

    @JsonProperty("caracteresTraduzidos")
    private List<DetailedTranslatedCharacter> characterList;

    private TradutorViewDetailed(List<DetailedTranslatedCharacter> characterList) {
        this.characterList = characterList;
    }

    public List<DetailedTranslatedCharacter> getCharacterList() {
        return characterList;
    }

    public static TradutorViewDetailed toView(List<DetailedTranslatedCharacter> detailedTranslatedCharacterList) {
        return new TradutorViewDetailed(detailedTranslatedCharacterList);
    }
}
