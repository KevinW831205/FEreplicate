package com.github.kevinw831205.Character.Abilities;

import com.github.kevinw831205.Character.FECharacter;

public interface Ability<T> {

    T onEquip();
    T onUnEquip();

}
