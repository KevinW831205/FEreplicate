package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.Abilities.MasteredAbility.HP_5;
import com.github.kevinw831205.Character.*;

public class Commoner extends UniqueClass {
    public Commoner() {
        this(
                "Commoner",
                0,
                0,
                false,
                20,
                new StatsBuilder().setMovement(4).build(),
                new GrowthRateBuilder().build()
        );
    }

    public Commoner(String className, Integer classXP, Integer minLevel, boolean hasMaster, Integer MasterXp, Stats baseStats, GrowthRate classGrowthRate) {
        super(className, classXP, minLevel, hasMaster, MasterXp, baseStats, classGrowthRate);
    }

    @Override
    public void master(FECharacter character) {
        super.master(null);
        character.getAbilities().add(new HP_5());
    }

    @Override
    public boolean canPromote(FECharacter characterToPromote) {
        return false;
    }
}
