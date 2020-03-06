package com.github.kevinw831205.Character.Equip;

import com.github.kevinw831205.Character.Abilities.Ability;

import java.util.Set;

public interface AbilityEquipper extends Equipper<Ability> {

    Set<Ability> getAbilitySlots();

    @Override
    default Ability equip(Ability toEquip, int slot){
        getAbilitySlots().add(toEquip);
    };

    @Override
    Ability unEquip(Ability toUnEquip, int slot);
}
