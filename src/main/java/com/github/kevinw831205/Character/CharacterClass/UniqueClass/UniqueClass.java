package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Mastery;
import com.github.kevinw831205.Character.Stats;

abstract public class UniqueClass implements CharacterClass {
    String className;
    Mastery mastery;
    Integer classXP;
    Integer minLevel;
    Stats baseStats;

    public UniqueClass(String className, Mastery mastery, Integer classXP, Integer minLevel, Stats baseStats) {
        this.className = className;
        this.mastery = mastery;
        this.classXP = classXP;
        this.minLevel = minLevel;
        this.baseStats = baseStats;
    }


}
