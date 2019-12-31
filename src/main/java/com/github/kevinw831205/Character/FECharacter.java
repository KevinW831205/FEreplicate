package com.github.kevinw831205.Character;

import com.github.kevinw831205.Character.Abilities.openSlot;
import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.WeaponSkillLevel.WeaponSkillLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FECharacter {
    private String name;
    private CharacterClass characterClass;
    private Stats stats;
    private Inventory inventory;
    private Set<CharacterClass> changeableClass;
    private WeaponSkillLevel weaponSkillLevel;
    private Integer currentHP;
    private boolean isAlive;
    private Gender gender;
    private ArrayList<Ability> abilities;
    private Ability[] equippedAbilities = new Ability[]{new openSlot(), new openSlot(), new openSlot(), new openSlot(), new openSlot()};
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
        this.abilities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean switchClass(CharacterClass target){
        if(! target.equals(characterClass) && changeableClass.contains(target) ){
            this.characterClass = target;
            return true;
        }
        return false;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public Ability[] getEquippedAbilities(){
        return equippedAbilities;
    }

    public void equipAbility(Integer slot, Ability ability){
        equippedAbilities[slot].unEquip(this);
        equippedAbilities[slot] = ability;
        equippedAbilities[slot].equip(this);

    }

    public List<Art> getArts() {
        return arts;
    }

    public Stats getStats() {
        return stats;
    }

    public void gainClassXp(Integer xp){
        if(!this.characterClass.isMastered()){
            this.characterClass.gainXP(xp);
            this.characterClass.master(this);
        }
    }
}
