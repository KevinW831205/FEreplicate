package com.github.kevinw831205.Character;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.WeaponSkillLevel.WeaponSkillLevel;

import java.util.ArrayList;

public class FECharacter {
    private String name;
    private CharacterClass characterClass;
    private Stats stats;
    private Inventory inventory;
    public ArrayList<CharacterClass> changeableClass;
    private WeaponSkillLevel weaponSkillLevel;
    private Integer currentHP;
    private boolean isAlive;
    private Gender gender;

    public FECharacter(String name, CharacterClass characterClass, Stats stats, Inventory inventory, WeaponSkillLevel weaponSkillLevel, Gender gender) {
        this.name = name;
        this.characterClass = characterClass;
        this.stats = stats;
        this.inventory = inventory;
        this.weaponSkillLevel = weaponSkillLevel;
        this.gender = gender;
    }

    public FECharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void switchClass(CharacterClass target){

    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }
}
