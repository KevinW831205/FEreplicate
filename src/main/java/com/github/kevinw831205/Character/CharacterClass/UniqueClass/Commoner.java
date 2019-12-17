package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.GrowthRateBuilder;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.StatsBuilder;

public class Commoner extends UniqueClass {

    public Commoner() {
        this(
                new StatsBuilder().setMovement(4).build(),
                "Commoner",
                0,
                0,
                new GrowthRateBuilder().build(),
                false
        );
    }

    private Commoner(Stats stats, String className, Integer minLevel, Integer classXp, GrowthRate growthRate, Boolean hasMastered) {
        super.baseStats = stats;
        super.className = className;
        super.classXP = classXp;
        super.classGrowthRate = growthRate;
        super.hasMastered = hasMastered;
        super.minLevel = minLevel;
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
    public GrowthRate getBaseGrowthRate() {
        return classGrowthRate;
    }
}
