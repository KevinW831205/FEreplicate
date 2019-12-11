package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.StatsBuilder;

public class Commoner extends UniqueClass {

//    public Commoner() {
//        super("Commoner", 0, null, null);  // ????
////
////        StatsBuilder baseStatsBuilder = new StatsBuilder();
////        baseStatsBuilder.setMaxHP(5);
////        Stats baseStats = baseStatsBuilder.build();
////        GrowthRate classGrowthRate = new GrowthRate();
////
////        this.setBaseStats(baseStats);
////        this.setClassGrowthRate(classGrowthRate);
//    }
    public Commoner(){
        this.baseStats = new StatsBuilder().build();
        this.className = "Commoner";
        this.classXP = 0;
        this.classGrowthRate = new GrowthRate();
        this.hasMastered = false;
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
