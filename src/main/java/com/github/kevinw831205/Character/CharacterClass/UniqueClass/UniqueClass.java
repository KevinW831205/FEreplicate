package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

abstract public class UniqueClass implements CharacterClass {

    private Integer minLevel;
    private String className;
    private Integer classXP;
    private boolean mastered;
    private Integer masterXP;
    private final Stats baseStats;
    private final GrowthRate classGrowthRate;

    public UniqueClass(String className, Integer classXP, Integer minLevel, boolean mastered, Integer masterXP, Stats baseStats, GrowthRate classGrowthRate) {
        this.minLevel = minLevel;
        this.mastered = mastered;
        this.className = className;
        this.classXP = classXP;
        this.masterXP = masterXP;
        this.baseStats = baseStats;
        this.classGrowthRate = classGrowthRate;
    }

    private boolean canMaster() {
        return this.classXP >= this.masterXP;
    }

    @Override
    public void master(FECharacter character) {
        if (canMaster()) {
            mastered = true;
        }
    }

    @Override
    public GrowthRate getClassGrowthRate() {
        return this.classGrowthRate;
    }

    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public Stats getBaseStats() {
        return this.baseStats;
    }

    @Override
    public void gainXP(int xp) {
        this.classXP += xp;
    }

    @Override
    public Integer getClassXP() {
        return classXP;
    }

    @Override
    public boolean isMastered() {
        return mastered;
    }


}
