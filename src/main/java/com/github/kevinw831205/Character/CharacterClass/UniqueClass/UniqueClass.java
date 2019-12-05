package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Masteries.*;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

abstract public class UniqueClass implements CharacterClass {
    String className;
    Mastery mastery;
    Integer classXP;
    Integer minLevel;
    Stats baseStats;
    GrowthRate classGrowthRate;


    public UniqueClass(String className, Mastery mastery, Integer classXP, Integer minLevel, Stats baseStats, GrowthRate classGrowthRate) {
        this.className = className;
        this.mastery = mastery;
        this.classXP = classXP;
        this.minLevel = minLevel;
        this.baseStats = baseStats;
        this.classGrowthRate = classGrowthRate;
    }
}
