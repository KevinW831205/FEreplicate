package com.github.kevinw831205.Character.Equip;

import com.github.kevinw831205.Character.Items.Item;

import java.util.List;

public class ItemEquipper implements Equipper<Item> {

    @Override
    public List<Item> getSlots() {
        return null;
    }

    @Override
    public Item equip(Equippable toEquip, int slot) {
        return null;
    }

    @Override
    public Item unEquip(Equippable toUnEquip, int slot) {
        return null;
    }
}
