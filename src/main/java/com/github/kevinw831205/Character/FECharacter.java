package com.github.kevinw831205.Character;

import com.github.kevinw831205.Character.Abilities.Ability;
import com.github.kevinw831205.Character.Abilities.StatsModifyAbility;
import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.WeaponSkillLevel.WeaponSkillLevel;
import com.github.kevinw831205.Target.FriendlyTarget;

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
//    private Ability[] equippedAbilities = new Ability[]{new OpenSlot(), new OpenSlot(), new OpenSlot(), new OpenSlot(), new OpenSlot()};
    private EquippedAbilities equippedAbilities = new EquippedAbilities();
    private ArrayList<Art> arts;
    private Crest crest;
    private boolean hasMoved = false;

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

    public EquippedAbilities getEquippedAbilities() {
        return equippedAbilities;
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

    public void moveTrue(){
        this.hasMoved = true;
    }

    public void moveFalse(){
        this.hasMoved = false;
    }

    public void equipAbility(Ability abilityToEquip){
        if(abilityToEquip instanceof StatsModifyAbility){
            this.stats.addStats(abilityToEquip.onEquip());
        }
    }
}
