package com.github.kevinw831205.Character.CharacterClass;

import com.github.kevinw831205.Character.GrowthRate;

public interface GrowthBonus {
    WeaponSkillGrowth getWeaponGrowthBonus();
    GrowthRate getGrowthRateBonus();
}

