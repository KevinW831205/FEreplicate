package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.CharacterClass.Masteries.MasterAbility.MasterAbility;
import com.github.kevinw831205.Character.CharacterClass.Masteries.MasterArt.MasterArt;
import com.github.kevinw831205.Character.GrowthRate;

public class Commoner extends UniqueClass {



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
