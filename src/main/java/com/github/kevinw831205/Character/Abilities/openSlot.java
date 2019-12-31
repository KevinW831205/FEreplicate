package com.github.kevinw831205.Character.Abilities;

import com.github.kevinw831205.Character.Ability;
import com.github.kevinw831205.Character.FECharacter;

public class openSlot implements Ability {

    public openSlot() {
    }

    @Override
    public void equip(FECharacter target, int abilitySlot) {
        target.getEquippedAbilities()[abilitySlot].unEquip(target);
        target.getEquippedAbilities()[abilitySlot] = this;
    }

    @Override
    public void unEquip(FECharacter target) {

    }
}
