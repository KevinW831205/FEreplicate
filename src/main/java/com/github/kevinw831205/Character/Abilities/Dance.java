package com.github.kevinw831205.Character.Abilities;

import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.StatsBuilder;
import com.github.kevinw831205.OwnUnit;

public class Dance extends OwnTargetAbility{

    private boolean hasSpecialDanceEffect;

    public Dance() {
        hasSpecialDanceEffect = false;
    }

    public void setHasSpecialDanceEffect(boolean hasSpecialDanceEffect) {
        this.hasSpecialDanceEffect = hasSpecialDanceEffect;
    }

    @Override
    public void use(OwnUnit target) {
        target.moveTrue();
        if(hasSpecialDanceEffect){
            target.getStats().addStats(new StatsBuilder().setDexterity(4).setSpeed(4).setLuck(4).build());

            //battle over remove
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
    public void onEquip(FECharacter target) {

    }

    @Override
    public void onUnEquip(FECharacter target) {

    }


}
