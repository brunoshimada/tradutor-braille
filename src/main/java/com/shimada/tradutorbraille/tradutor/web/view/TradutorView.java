package com.shimada.tradutorbraille.tradutor.web.view;

import java.util.List;

public class TradutorView {

    private List<Character> characterList;

    private TradutorView(List<Character> characterList) {
        this.characterList = characterList;
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public static TradutorView toView(List<Character> characterList) {
        return new TradutorView(characterList);
    }

}
