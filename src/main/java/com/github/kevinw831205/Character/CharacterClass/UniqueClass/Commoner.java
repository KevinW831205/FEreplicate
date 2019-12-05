package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.Masteries.*;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

public class Commoner extends UniqueClass {

    String className;
    Mastery mastery;
    Integer xp;
    Integer minLevel;
    Stats baseStats;
    GrowthRate classGrowthRate;



    public Commoner(Mastery mastery, Integer classXP, Integer minLevel, Stats baseStats, GrowthRate classGrowthRate, String className1, Mastery mastery1, Integer xp, Integer minLevel1, Stats baseStats1) {
        super("Commoner", mastery, classXP, minLevel, baseStats, classGrowthRate);
    }

    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public void classLevelUp() {

    }

    @Override
    public void mastered() {

    }


    @Override
    public GrowthRate getBaseGrowthRate() {
        return classGrowthRate;
    }
}
