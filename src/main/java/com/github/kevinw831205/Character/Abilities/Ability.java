package com.github.kevinw831205.Character.Abilities;

public interface Ability<someType> {
    someType onEquip();
    someType onUnEquip();
}
