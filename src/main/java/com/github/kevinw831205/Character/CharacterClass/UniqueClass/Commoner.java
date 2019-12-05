package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.Masteries.*;
import com.github.kevinw831205.Character.CharacterClass.Masteries.MasterAbility.MasterAbility;
import com.github.kevinw831205.Character.CharacterClass.Masteries.MasterArt.MasterArt;
import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.Stats;

public class Commoner extends UniqueClass {

    String className;
    Mastery mastery;
    Integer minLevel;
    Stats baseStats;
    GrowthRate classGrowthRate;



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
    public void mastered() {

    }

    @Override
    public GrowthRate getBaseGrowthRate() {
        return classGrowthRate;
    }
}
