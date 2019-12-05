package com.github.kevinw831205.Character;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;

import java.util.ArrayList;

public class FECharacter {
    private String name;
    private CharacterClass cClass;
    private Stats stats;
    private Inventory inventory;
    private ArrayList<Object> changeableClass;
    

    public FECharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
