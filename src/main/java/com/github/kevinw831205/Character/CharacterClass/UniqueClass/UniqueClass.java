package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Masteries.Mastery;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

abstract public class UniqueClass implements CharacterClass, Mastery {

    Integer minLevel;
    String className;
    Integer classXP;
    boolean hasMastered;
    Stats baseStats;
    GrowthRate classGrowthRate;

    public UniqueClass(String className, Integer classXP, Stats baseStats, GrowthRate classGrowthRate) {
        this.minLevel = 0;
        this.hasMastered = false;

        this.className = className;
        this.classXP = classXP;
        this.baseStats = baseStats;
        this.classGrowthRate = classGrowthRate;
    }

    @Override
    public void mastered() {
        hasMastered = true;
    }

}
