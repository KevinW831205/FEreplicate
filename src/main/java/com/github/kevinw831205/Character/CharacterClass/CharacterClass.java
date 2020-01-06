package com.github.kevinw831205.Character.CharacterClass;

import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

public interface CharacterClass extends Masterable {
    String getClassName();

    GrowthRate getClassGrowthRate();

    Stats getBaseStats();

    Integer getMasteryXP();

    void gainXP(int xp);

    Integer getClassXP();

    boolean isMastered();

//    void getAbilities();
//
//    void removeAbilities();
}
