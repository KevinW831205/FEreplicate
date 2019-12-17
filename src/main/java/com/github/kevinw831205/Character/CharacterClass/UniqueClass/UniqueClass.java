package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Mastery;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

abstract public class UniqueClass implements CharacterClass {

    private Integer minLevel;
    private String className;
    private Integer classXP;
    private boolean hasMastered;
    private Stats baseStats;
    private GrowthRate classGrowthRate;

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

    public Integer getMinLevel() {
        return minLevel;
    }

    @Override
    public String getClassName() {
        return className;
    }

    public Integer getClassXP() {
        return classXP;
    }

    public boolean isHasMastered() {
        return hasMastered;
    }

    public GrowthRate getClassGrowthRate() {
        return classGrowthRate;
    }
}
