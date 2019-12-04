package com.company;

abstract class Character {
    String name;
    CharacterClass characterClass;
    Inventory inventory;
    Stats stats;

    public Character(String name, CharacterClass characterClass, Inventory inventory, Stats stats) {
        this.name = name;
        this.characterClass = characterClass;
        this.inventroy = inventroy;
        this.stats = stats;
    }
}
