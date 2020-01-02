package com.github.kevinw831205.Character;

import com.github.kevinw831205.Character.Abilities.OpenSlot;

public class EquippedAbilities {

    Ability ability1;
    Ability ability2;
    Ability ability3;
    Ability ability4;
    Ability ability5;

    public EquippedAbilities() {
        this(new OpenSlot(), new OpenSlot(), new OpenSlot(), new OpenSlot(), new OpenSlot());
    }

    public EquippedAbilities(Ability ability1, Ability ability2, Ability ability3, Ability ability4, Ability ability5) {
        this.ability1 = ability1;
        this.ability2 = ability2;
        this.ability3 = ability3;
        this.ability4 = ability4;
        this.ability5 = ability5;
    }
}
