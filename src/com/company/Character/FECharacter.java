package com.company.Character;

import com.company.Character.CharacterClass.CharacterClass;
import com.company.Character.CharacterClass.Commoner;

import java.util.ArrayList;

public class FECharacter {
    private String name;
    private CharacterClass characterClass;
    private Inventory inventory;
    private Stats stats;
    private ArrayList<CharacterClass> promotedClasses = new ArrayList<CharacterClass>();

    public FECharacter(String name, CharacterClass characterClass, Inventory inventory, Stats stats) {
        this.name = name;
        this.stats = stats;
        this.characterClass = new Commoner();
        this.characterClass.statBonus();
        this.promotedClasses.add(this.characterClass);
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

    public void addPromotedClass(CharacterClass promotedClass){
        if(!promotedClasses.contains(promotedClass)){
            promotedClasses.add(promotedClass);
        }
    }

    public void changeClass(CharacterClass toChange){
        if(promotedClasses.contains(toChange)){
            characterClass = toChange;
        }
    }
}
