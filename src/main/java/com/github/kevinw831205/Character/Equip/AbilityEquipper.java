package com.github.kevinw831205.Character.Equip;

import com.github.kevinw831205.Character.Abilities.Ability;

import java.util.Set;

public interface AbilityEquipper extends Equipper<Ability> {

    @Override
    Set<Ability> getSlots();

    @Override
    Ability equip(Ability toEquip, int slot);

    @Override
    Ability unEquip(Ability toUnEquip, int slot);
}
