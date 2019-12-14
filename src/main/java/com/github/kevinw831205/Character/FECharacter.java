package com.github.kevinw831205.Character;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.WeaponSkillLevel.WeaponSkillLevel;

import java.util.ArrayList;


//this is an instantiable character ?? so this is not the interface correct ??
public class FECharacter {
    private String name;
    private CharacterClass characterClass;
    private Stats stats;
    private Inventory inventory;

    //why is changeable class an ArrayList ??
    private ArrayList<CharacterClass> changeableClass;

    private WeaponSkillLevel weaponSkillLevel;
    private Integer currentHP;
    private boolean isAlive;
    private Gender gender;
    private ArrayList<Ability> abilities;
    private ArrayList<Art> arts;
    private Crest crest;

    public FECharacter(String name, CharacterClass characterClass, Stats stats, Inventory inventory, WeaponSkillLevel weaponSkillLevel, Gender gender) {
        this.name = name;
        this.characterClass = characterClass;
        this.stats = stats;
        this.inventory = inventory;
        this.weaponSkillLevel = weaponSkillLevel;
        this.gender = gender;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public boolean switchClass(CharacterClass target){
        if(! target.equals(characterClass)){
            this.characterClass = target;
            return true;
        }
        return false;
    }
//      what is the danger of returning null ??
//     public CharacterClass switchClass1(CharacterClass target){
//       if(! target.equals(characterClass)){
//       return characterClass=target;
//       }
//       return null;
//     }


    public CharacterClass getCharacterClass() {
        return characterClass;
    }
}
