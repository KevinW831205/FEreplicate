package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.*;
import com.github.kevinw831205.Character.Abilities.MasteredAbility.HP_5;

public class Nobel extends UniqueClass {

    public Nobel() {
        this(
                "Nobel",
                0,
                0,
                false,
                20,
                new StatsBuilder().setMovement(4).build(),
                new GrowthRateBuilder().build()
        );
    }

    public Nobel(String className, Integer classXP, Integer minLevel, boolean mastered, Integer masteryXP, Stats baseStats, GrowthRate classGrowthRate) {
        super(className, classXP, minLevel, mastered, masteryXP, baseStats, classGrowthRate);
    }

    @Override
    public void master(FECharacter character) {
        super.master(null);
        character.getAbilities().add(new HP_5());
    }
}
