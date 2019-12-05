package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.Mastery;
import com.github.kevinw831205.Character.Stats;

public class Commoner extends UniqueClass {

    String className;
    Mastery mastery;
    Integer xp;
    Integer minLevel;
    Stats baseStats;

    public Commoner(Mastery mastery, Integer classXP, Integer minLevel, Stats baseStats) {
        super("commoner", mastery, classXP, minLevel, baseStats);
    }

    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public void classLevelUp() {

    }

    @Override
    public void mastered() {

    }
}
