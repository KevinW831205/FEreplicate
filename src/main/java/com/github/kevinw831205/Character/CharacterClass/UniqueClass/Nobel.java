package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.Masteries.Mastery;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

public class Nobel extends UniqueClass {

    public Nobel(String className, Mastery mastery, Integer classXP, Integer minLevel, Stats baseStats, GrowthRate classGrowthRate) {
        super(className, mastery, classXP, minLevel, baseStats, classGrowthRate );
    }

    @Override
    public String getClassName() {
        return null;
    }

    @Override
    public void classLevelUp() {

    }

    @Override
    public Stats getBaseGrowthRate() {
        return null;
    }

    @Override
    public void mastered() {

    }
}
