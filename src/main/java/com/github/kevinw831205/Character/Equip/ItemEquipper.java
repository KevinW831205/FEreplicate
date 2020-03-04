package com.github.kevinw831205.Character.Equip;

import com.github.kevinw831205.Character.Items.Item;

import java.util.List;

public interface ItemEquipper extends Equipper<Item> {
    @Override
    List<Item> getSlots();

    @Override
    Item equip(Item toEquip, int slot);

    @Override
    Item unEquip(Item toUnEquip, int slot);
}
