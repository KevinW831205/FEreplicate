package com.github.kevinw831205.Character.Abilities.MasteredAbility;

import com.github.kevinw831205.Character.Abilities.Dance;
import com.github.kevinw831205.Character.FECharacter;

public class SpecialDance extends MasteredAbility{

    Dance boundedDance;

    public SpecialDance(Dance boundedDance) {
        this.boundedDance = boundedDance;
    }

    @Override
    public void onEquip(FECharacter target) {
        if(target.getAbilities().contains(this)){
            boundedDance.setHasSpecialDanceEffect(true);
        }
    }

    @Override
    public void onUnEquip(FECharacter target) {
        boundedDance.setHasSpecialDanceEffect(false);
    }
}
