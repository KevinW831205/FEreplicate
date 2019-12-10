package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

public abstract class UniqueClassBuilder extends UniqueClass{
    private String className;
    private Integer classXP;
    private Stats baseStats;
    private GrowthRate classGrowthRate;

    public UniqueClassBuilder setClassName(String className) {
        this.className = className;
        return this;
    }

    public UniqueClassBuilder setClassXP(Integer classXP) {
        this.classXP = classXP;
        return this;
    }

    public UniqueClassBuilder setBaseStats(Stats baseStats) {
        this.baseStats = baseStats;
        return this;
    }

    public UniqueClassBuilder setClassGrowthRate(GrowthRate classGrowthRate) {
        this.classGrowthRate = classGrowthRate;
        return this;
    }

    public UniqueClass createUniqueClass() {
        return super(className, classXP, baseStats, classGrowthRate);
    }
}