package com.github.kevinw831205.Character;

import com.github.kevinw831205.Character.Abilities.OpenSlot;

public class EquippedAbilities {

    Ability[] equippedAbilities = new Ability[5];

    public EquippedAbilities() {
        this(new OpenSlot(), new OpenSlot(), new OpenSlot(), new OpenSlot(), new OpenSlot());
    }

    public EquippedAbilities(Ability ability1, Ability ability2, Ability ability3, Ability ability4, Ability ability5) {
        equippedAbilities[0] = ability1;
        equippedAbilities[1] = ability2;
        equippedAbilities[2] = ability3;
        equippedAbilities[3] = ability4;
        equippedAbilities[4] = ability5;
    }

    public void equipAbility(FECharacter target, Ability ability, int slot) {
        slot = slot-1;
        equippedAbilities[slot].unEquip(target);
        equippedAbilities[slot] = ability;
        ability.equip(target);
    }

    public Ability slot(int slot){
        System.out.println(slot);
        return equippedAbilities[slot-1];
    }
}
