package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Mastery;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

public interface UniqueClassInterface extends CharacterClass, Mastery {

    Integer getMinLevel();

    Integer getClassXP();

    boolean isHasMastered();

    GrowthRate getClassGrowthRate();
}

