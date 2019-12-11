package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

public abstract class UniqueClassBuilder {
    private String className;
    private Integer classXP;
    private Stats baseStats;
    private GrowthRate classGrowthRate;

    public String getClassName() {
        return className;
    }

    public Integer getClassXP() {
        return classXP;
    }

    public Stats getBaseStats() {
        return baseStats;
    }

    public GrowthRate getClassGrowthRate() {
        return classGrowthRate;
    }

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
}