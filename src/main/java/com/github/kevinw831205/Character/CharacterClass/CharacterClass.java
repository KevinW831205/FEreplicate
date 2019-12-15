package com.github.kevinw831205.Character.CharacterClass;

import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

public interface CharacterClass extends Mastery {
    public String getClassName();
    public void mastered();
    public GrowthRate getBaseGrowthRate();
    public Stats getBaseStats();
}
