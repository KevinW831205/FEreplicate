package com.company;

 abstract public class Character implements CharacterClass{
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
