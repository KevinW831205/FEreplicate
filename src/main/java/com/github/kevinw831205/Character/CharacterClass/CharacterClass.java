package com.github.kevinw831205.Character.CharacterClass;

import com.github.kevinw831205.Character.Stats;

public interface CharacterClass {
    public String getClassName();
    public void classLevelUp();
    public void mastered();
    public Stats getBaseGrowthRate();

 }
