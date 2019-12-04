package com.company;

public class Character {
    private String name;
    private CharacterClass characterClass;
    private Inventory inventory;
    private Stats stats;

    public Character(String name, CharacterClass characterClass, Inventory inventory, Stats stats) {
        this.name = name;
        this.characterClass = characterClass;
        this.inventory = inventory;
        this.stats = stats;
    }
}
