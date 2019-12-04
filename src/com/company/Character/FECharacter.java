package com.company.Character;

import com.company.Character.CharacterClass.CharacterClass;
import com.company.Character.CharacterClass.Commoner;

public class FECharacter {
    private String name;
    private CharacterClass characterClass;
    private Inventory inventory;
    private Stats stats;

    public FECharacter(String name, CharacterClass characterClass, Inventory inventory, Stats stats) {
        this.name = name;
        this.stats = stats;
        this.characterClass = new Commoner();
        this.characterClass.statBonus();
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Stats getStats() {
        return stats;
    }
}
