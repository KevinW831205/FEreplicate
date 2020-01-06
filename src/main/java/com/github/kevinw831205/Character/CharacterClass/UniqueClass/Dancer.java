package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

public class Dancer extends UniqueClass{

    public Dancer() {
        this(
                null,
                null,
                null,
                false,
                null,
                null,
                null
        );
    }

    private Dancer(String className, Integer classXP, Integer minLevel, boolean mastered, Integer masteryXP, Stats baseStats, GrowthRate classGrowthRate) {
        super(className, classXP, minLevel, mastered, masteryXP, baseStats, classGrowthRate);
    }

    @Override
    public void getClassAbilities(FECharacter target) {
    }

    @Override
    public void removeClassAbilities(FECharacter target) {
    }
}
