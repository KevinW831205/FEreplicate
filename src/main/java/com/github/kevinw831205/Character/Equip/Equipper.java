package com.github.kevinw831205.Character.Equip;

import java.util.List;

public interface Equipper<someEquippable extends Equippable> {
    List<someEquippable> getSlots();
    someEquippable equip(Equippable toEquip, int slot);
    someEquippable unEquip(Equippable toUnEquip, int slot);


}
