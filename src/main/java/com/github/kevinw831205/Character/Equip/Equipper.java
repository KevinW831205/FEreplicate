package com.github.kevinw831205.Character.Equip;

public interface Equipper<someEquippable extends Equippable> {
    public someEquippable equip(Equippable toEquip, int slot);
    public someEquippable unEquip(Equippable toUnEquip, int slot);

}
