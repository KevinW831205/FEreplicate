package com.github.kevinw831205.Character.Equip;

import java.util.Collection;

public interface Equipper<someEquippable extends Equippable> {
    Collection<someEquippable> getSlots();
    someEquippable equip(someEquippable toEquip, int slot);
    someEquippable unEquip(someEquippable toUnEquip, int slot);
}
