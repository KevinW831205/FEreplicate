package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.StatsBuilder;

public class CommonerBuilder extends UniqueClassBuilder {



    @Override
    public Commoner build() {
        this.setBaseStats(new StatsBuilder().build());
        this.setClassGrowthRate(new GrowthRate());
        this.setClassName("commoner");
        this.setClassXP(0);
        return
    }
}
