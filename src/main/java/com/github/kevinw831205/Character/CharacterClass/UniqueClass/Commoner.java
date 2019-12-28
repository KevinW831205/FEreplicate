package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.Abilities.MasteredAbility.HP_5;
import com.github.kevinw831205.Character.CharacterClass.Mastery;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.GrowthRateBuilder;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.StatsBuilder;

import java.util.List;

public class Commoner extends UniqueClass {

//    private final GrowthRate classGrowthRate = new GrowthRateBuilder().build();
//    private final Stats baseStats = new StatsBuilder().setMovement(4).build();

    public Commoner() {
        this(
                "Commoner",
                0,
                0,
                false,
                new StatsBuilder().setMovement(4).build(),
                new GrowthRateBuilder().build()
        );
    }

    public Commoner(String className, Integer classXP, Integer minLevel, boolean hasMaster, Stats baseStats, GrowthRate classGrowthRate) {
        super(className, classXP, minLevel, hasMaster, baseStats, classGrowthRate);
    }

    @Override
    public GrowthRate getBaseGrowthRate() {
        return null;
    }

    @Override
    public void getMastery(List<Mastery> abilities,  List<Mastery> arts) {
        abilities.add(new HP_5());
    }
}
