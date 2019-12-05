package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.Masteries.Mastery;
import com.github.kevinw831205.Character.Stats;

public class Nobel extends UniqueClass {

    public Nobel(String className, Mastery mastery, Integer classXP, Integer minLevel, Stats baseStats) {
        super(className, mastery, classXP, minLevel, baseStats);
    }

    @Override
    public String getClassName() {
        return null;
    }

    @Override
    public void classLevelUp() {

    }

    @Override
    public void mastered() {

    }
}
