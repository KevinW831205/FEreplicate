package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.StatsBuilder;

public class Commoner extends UniqueClass {

    public Commoner() {
        super("Commoner", 0, new StatsBuilder().setMaxHP(5).createStats(), null);  // ????


        GrowthRate classGrowthRate = new GrowthRate();
        this.setClassGrowthRate(classGrowthRate);
    }

    @Override
    public String getClassName() {
        return this.className;
    }




    @Override
    public Stats getBaseStats() {
        return super.getBaseStats();
    }

    @Override
    public GrowthRate getBaseGrowthRate() {
        return classGrowthRate;
    }
}
