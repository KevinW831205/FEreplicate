package com.github.kevinw831205.Character.CharacterClass;

import com.github.kevinw831205.Character.GrowthRate;

public interface CharacterClass {
    public String getClassName();
    public void mastered();
    public GrowthRate getBaseGrowthRate();

 }
