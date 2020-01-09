package com.github.kevinw831205.Character.Abilities;

import com.github.kevinw831205.Character.FECharacter;

import java.util.Objects;

public class OpenSlot implements Ability {
    String abilityName = "Open slot";

    public OpenSlot() {
    }

    @Override
    public void onEquip(FECharacter target) {
    }

    @Override
    public void onUnEquip(FECharacter target) {
    }

    @Override
    public String toString() {
        return this.abilityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenSlot openSlot = (OpenSlot) o;
        return Objects.equals(abilityName, openSlot.abilityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abilityName);
    }
}
