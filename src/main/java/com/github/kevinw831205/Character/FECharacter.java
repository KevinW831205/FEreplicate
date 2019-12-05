package com.github.kevinw831205.Character;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Soldier;
import com.github.kevinw831205.Character.Weapon.WeaponLevel;
import javafx.collections.transformation.SortedList;

import java.util.ArrayList;

public class FECharacter {
    private String name;
    private CharacterClass cClass;
    private Stats stats;
    private Inventory inventory;
    private ArrayList<CharacterClass> changeableClass;
    private WeaponLevel weaponLevel;
    private Integer currentHP;
    private boolean isAlive;


    public FECharacter(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }
}
