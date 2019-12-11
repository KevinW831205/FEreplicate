package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Mastery;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

abstract public class UniqueClass implements CharacterClass, Mastery {

    protected Integer minLevel;
    protected String className;
    protected Integer classXP;
    protected boolean hasMastered;
    protected Stats baseStats;
    protected GrowthRate classGrowthRate;

//    public UniqueClass(String className, Integer classXP, Stats baseStats, GrowthRate classGrowthRate) {
//        this.minLevel = 0;
//        this.hasMastered = false;
//        this.className = className;
//        this.classXP = classXP;
//        this.baseStats = baseStats;
//        this.classGrowthRate = classGrowthRate;
//    }

    @Override
    public void mastered() {
        hasMastered = true;
    }


    public Stats getBaseStats() {
        return baseStats;
    }
}
