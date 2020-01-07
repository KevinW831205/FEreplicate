package com.github.kevinw831205;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.Gender;
import com.github.kevinw831205.Character.Inventory;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.WeaponSkillLevel.WeaponSkillLevel;
import com.github.kevinw831205.Target.FriendlyTarget;

public class FriendlyUnit extends FECharacter implements FriendlyTarget {
    public FriendlyUnit(String name, CharacterClass characterClass, Stats stats, Inventory inventory, WeaponSkillLevel weaponSkillLevel, Gender gender) {
        super(name, characterClass, stats, inventory, weaponSkillLevel, gender);
    }
}
