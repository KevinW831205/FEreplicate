package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.StatsBuilder;

public class Commoner extends UniqueClass {

    public Commoner(){
        this(new Stats(),
                "Commoner",
                0,
                0,
                new GrowthRate(),
                false);
    }

    private Commoner(Stats stats, String className, Integer minLevel, Integer classXp, GrowthRate growthRate, Boolean hasMastered) {
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
    public Stats getBaseStats() {
        return super.getBaseStats();
    }

    @Override
    public GrowthRate getBaseGrowthRate() {
        return classGrowthRate;
    }
}
