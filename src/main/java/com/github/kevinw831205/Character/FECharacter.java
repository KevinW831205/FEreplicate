package com.github.kevinw831205.Character;

import com.github.kevinw831205.Character.Abilities.Ability;
import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.Equip.AbilityEquipper;
import com.github.kevinw831205.Character.Equip.ItemEquipper;
import com.github.kevinw831205.Character.Items.Item;
import com.github.kevinw831205.Character.WeaponSkillLevel.WeaponSkillLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FECharacter implements ItemEquipper, AbilityEquipper {
    private String name;
    private CharacterClass characterClass;
    private Stats stats;
    private Inventory inventory;
    private Set<CharacterClass> changeableClass;
    private WeaponSkillLevel weaponSkillLevel;
    private Integer currentHP;
    private boolean isAlive;
    private Gender gender;
    //    private Ability[] equippedAbilities = new Ability[]{new OpenSlot(), new OpenSlot(), new OpenSlot(), new OpenSlot(), new OpenSlot()};
    private ArrayList<Art> arts;
    private Crest crest;
    private boolean hasMoved = false;

    public FECharacter(String name, CharacterClass characterClass, Stats stats, Inventory inventory, WeaponSkillLevel weaponSkillLevel, Gender gender) {
        this.name = name;
        this.characterClass = characterClass;
        this.stats = stats;
        this.inventory = inventory;
        this.weaponSkillLevel = weaponSkillLevel;
        this.gender = gender;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public boolean switchClass(CharacterClass target) {
        if (!target.equals(characterClass) && changeableClass.contains(target)) {
            this.characterClass = target;
            return true;
        }
        return false;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public List<Art> getArts() {
        return arts;
    }

    public Stats getStats() {
        return stats;
    }

    public void gainClassXp(Integer xp) {
        if (!this.characterClass.isMastered()) {
            this.characterClass.gainXP(xp);
            this.characterClass.master(this);
        }
    }

    public void moveTrue() {
        this.hasMoved = true;
    }

    public void moveFalse() {
        this.hasMoved = false;
    }


    @Override
    public Set<Ability> getAbilitySlot() {
        return null;
    }

    @Override
    public Ability equip(Ability toEquip, int slot) {
//        super.AbilityEquppier.equip();
//        super.OtherEquipper.equip();

        AbilityEquipper

        return null;
    }

    @Override
    public Ability unEquip(Ability toUnEquip, int slot) {
        return null;
    }

    @Override
    public List<Item> getInventory() {
        return null;
    }

    @Override
    public Item equip(Item toEquip, int slot) {
        return null;
    }

    @Override
    public Item unEquip(Item toUnEquip, int slot) {
        return null;
    }
}
