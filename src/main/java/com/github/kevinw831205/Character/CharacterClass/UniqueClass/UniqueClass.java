package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

abstract public class UniqueClass implements CharacterClass {

    private Integer minLevel;
    private String className;
    private Integer classXP;
    private boolean hasMastered;
    private Stats baseStats;
    private GrowthRate classGrowthRate;

    public UniqueClass(String className, Integer classXP, Integer minLevel, boolean hasMaster, Stats baseStats, GrowthRate classGrowthRate) {
        this.minLevel = minLevel;
        this.hasMastered = hasMaster;
        this.className = className;
        this.classXP = classXP;
    }

    @Override
    public void mastered() {
        hasMastered = true;
    }



}
