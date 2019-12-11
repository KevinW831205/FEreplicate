package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

public class Nobel extends UniqueClass {

    public Nobel() {
        this(
                new Stats(),
                "Nobel",
                0,
                0,
                new GrowthRate(),
                false
        );
    }

    private Nobel(Stats stats, String className, Integer minLevel, Integer classXp, GrowthRate growthRate, Boolean hasMastered) {
        this.baseStats = stats;
        this.className = className;
        this.classXP = classXp;
        this.classGrowthRate = growthRate;
        this.hasMastered = hasMastered;
        this.minLevel = minLevel;
    }

    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public GrowthRate getBaseGrowthRate() {
        return this.classGrowthRate;
    }
}
