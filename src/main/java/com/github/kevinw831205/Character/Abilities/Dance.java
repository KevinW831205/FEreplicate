package com.github.kevinw831205.Character.Abilities;

import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.FriendlyUnit;
import com.github.kevinw831205.OwnUnit;
import com.github.kevinw831205.Target.FETarget;
import com.github.kevinw831205.Target.FriendlyTarget;
import com.github.kevinw831205.Target.OwnTarget;

public class Dance extends OwnTargetAbility{


    @Override
    public void use(OwnUnit target) {
        target.moveTrue();
    }

//    @Override
//    public void use(OwnTarget target) {
//
//    }

    @Override
    public int getRange() {
        return 0;
    }

    @Override
    public void equip(FECharacter target) {

    }

    @Override
    public void unEquip(FECharacter target) {

    }
}
