package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Masteries.Mastery;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

abstract public class UniqueClass implements CharacterClass, Mastery {

    Integer minLevel;
    String className;
    Integer classXP;
    boolean hasMastered;
    Stats baseStats;
    GrowthRate classGrowthRate;


}
