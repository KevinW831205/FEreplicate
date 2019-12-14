package com.github.kevinw831205.Character.CharacterClass;

import com.github.kevinw831205.Character.*;
import com.github.kevinw831205.Character.WeaponSkillLevel.WeaponSkillLevel;

import java.util.ArrayList;

public interface CharacterClass {
    public String getClassName();
    public void mastered();
    public GrowthRate getBaseGrowthRate();
    public Stats getBaseStats();
    public Inventory getInventory();
    public WeaponSkillLevel getWeaponSkillLevel();
    public Integer getHP();
    public Gender getGender();
    public Crest getCrest();
    public boolean getIsAlive();
    public ArrayList<Ability> getAbilities();
    public ArrayList<CharacterClass> getChangeableClass();
    public ArrayList<Art> getArts();
}
