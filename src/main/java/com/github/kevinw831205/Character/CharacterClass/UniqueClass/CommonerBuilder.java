package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

public class CommonerBuilder extends UniqueClassBuilder {
    private Commoner commoner;
    private CommonerBuilder commonerBuilder = new CommonerBuilder();

    private CommonerBuilder() {
    }


    public Commoner build() {
//        return new (Commoner) this;
        return commoner;
    }
}
