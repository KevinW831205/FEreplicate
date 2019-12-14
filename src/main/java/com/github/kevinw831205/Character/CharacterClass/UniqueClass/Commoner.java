package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.*;
import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.WeaponSkillLevel.WeaponSkillLevel;

import java.util.ArrayList;

public class Commoner extends UniqueClass {
    

    public Commoner() {
        this(
                new StatsBuilder().setMovement(4).build(),
                "Commoner",
                0,
                0,
                new GrowthRateBuilder().build(),
                false
                /*
                * StatsBuilder().setHP(5).build()
                * */
        );
    }

    private Commoner(Stats stats, String className, Integer minLevel, Integer classXp, GrowthRate growthRate, Boolean hasMastered) {
        this.baseStats = stats;
        this.className = className;
        this.classXP = classXp;
        this.classGrowthRate = growthRate;
        this.hasMastered = hasMastered;
        this.minLevel = minLevel;
////     Inventory inventory;
////     WeaponSkillLevel weaponSkillLevel;
////     Integer HP;
////     Gender gender;
////     Crest crest;
////     boolean isAlive;
////     ArrayList<Ability> ability;
////     ArrayList<CharacterClass> changeableClass;
////     ArrayList<Art> arts;


    }


    @Override
    public String getClassName() {
        return this.className;
    }


    @Override
    public Stats getBaseStats() {
        return super.getBaseStats();
    }

    @Override
    public Inventory getInventory() {
        return null;
    }

    @Override
    public WeaponSkillLevel getWeaponSkillLevel() {
        return null;
    }

    @Override
    public Integer getHP() {
        return null;
    }

    @Override
    public Gender getGender() {
        return null;
    }

    @Override
    public Crest getCrest() {
        return null;
    }

    @Override
    public boolean getIsAlive() {
        return false;
    }

    @Override
    public ArrayList<Ability> getAbilities() {
        return null;
    }

    @Override
    public ArrayList<CharacterClass> getChangeableClass() {
        return null;
    }

    @Override
    public ArrayList<Art> getArts() {
        return null;
    }

    @Override
    public GrowthRate getBaseGrowthRate() {
        return classGrowthRate;
    }
}
