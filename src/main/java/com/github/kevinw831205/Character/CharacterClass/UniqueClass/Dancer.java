package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.*;

public class Dancer extends UniqueClass{

    public Dancer() {
        this(
                "Dancer",
                0,
                0,
                false,
                100,
                new StatsBuilder().setMovement(6).build(),
                new GrowthRateBuilder().setHPGrowth(20).setStrengthGrowth(-5).setDefenseGrowth(-5).setResistanceGrowth(-5).setCharmGrowth(10).build()
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
