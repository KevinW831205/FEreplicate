package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Masteries.*;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

abstract public class UniqueClass implements CharacterClass, Mastery {
    String className;
    boolean hasMastered;
    Integer classXP;
    Integer minLevel;
    Stats baseStats;
    GrowthRate classGrowthRate;


}
