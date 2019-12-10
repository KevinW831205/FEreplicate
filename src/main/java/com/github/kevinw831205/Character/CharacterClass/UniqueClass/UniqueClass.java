package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Mastery;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

 abstract public class UniqueClass implements UniqueClassInterface {

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
     public String getClassName() {
         return null;
     }

     @Override
    public void mastered() {
        hasMastered = true;
    }

     @Override
     public GrowthRate getBaseGrowthRate() {
         return null;
     }

     public void setBaseStats(Stats baseStats) {
        this.baseStats = baseStats;
    }

    public void setClassGrowthRate(GrowthRate classGrowthRate) {
        this.classGrowthRate = classGrowthRate;
    }

    public Stats getBaseStats() {
        return baseStats;
    }

     @Override
     public Integer getMinLevel() {
         return null;
     }

     @Override
     public Integer getClassXP() {
         return null;
     }

     @Override
     public boolean isHasMastered() {
         return false;
     }

     @Override
     public GrowthRate getClassGrowthRate() {
         return null;
     }
 }
