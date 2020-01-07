package com.github.kevinw831205.Character.Abilities;

import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.StatsBuilder;
import com.github.kevinw831205.FriendlyUnit;
import com.github.kevinw831205.OwnUnit;
import com.github.kevinw831205.Target.FETarget;
import com.github.kevinw831205.Target.FriendlyTarget;
import com.github.kevinw831205.Target.OwnTarget;

public class Dance extends OwnTargetAbility{

    private boolean hasSpecialDanceEffect;

    public Dance() {
        hasSpecialDanceEffect = false;
    }

    @Override
    public void use(OwnUnit target) {
        target.moveTrue();
        if(hasSpecialDanceEffect){
            target.getStats().addStats(new StatsBuilder().setDexterity(4).setSpeed(4).setLuck(4).build());
        }
    }

//    @Override
//    public void use(OwnTarget target) {
//
//    }

    @Override
    public int getRange() {
        return 4;
    }

    @Override
    public void equip(FECharacter target) {

    }

    @Override
    public void unEquip(FECharacter target) {

    }
}
