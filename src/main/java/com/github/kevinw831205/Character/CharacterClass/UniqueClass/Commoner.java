package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.Masteries.MasterAbility.MasterAbility;
import com.github.kevinw831205.Character.CharacterClass.Masteries.MasterArt.MasterArt;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.StatsBuilder;

public class Commoner extends UniqueClass {

    public Commoner() {
        super("Commoner", 0, null, null);  // ????

        StatsBuilder baseStatsBuilder = new StatsBuilder();
        Stats baseStats = baseStatsBuilder.createStats();
        GrowthRate classGrowthRate = new GrowthRate();
        this.setBaseStats(baseStats);
        this.setClassGrowthRate(classGrowthRate);
    }

    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public MasterAbility getMasteredAbility() {
        return null;
    }

    @Override
    public MasterArt getMasteredArt() {
        return null;
    }


    @Override
    public GrowthRate getBaseGrowthRate() {
        return classGrowthRate;
    }
}
