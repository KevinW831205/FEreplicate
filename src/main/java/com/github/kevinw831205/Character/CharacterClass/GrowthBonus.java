package com.github.kevinw831205.Character.CharacterClass;

import com.github.kevinw831205.Character.GrowthRate;
import com.github.kevinw831205.Character.WeaponSkillLevel.WeaponSkillGrowth;

public interface GrowthBonus {
    WeaponSkillGrowth getWeaponGrowthBonus();
    GrowthRate getGrowthRateBonus();
}

