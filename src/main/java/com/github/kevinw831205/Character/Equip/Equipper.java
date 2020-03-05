package com.github.kevinw831205.Character.Equip;

public interface Equipper<someEquippable extends Equippable> {
    someEquippable equip(someEquippable toEquip, int slot);
    someEquippable unEquip(someEquippable toUnEquip, int slot);
}
