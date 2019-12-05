package com.github.kevinw831205;

import com.github.kevinw831205.Character.ChangeableClass;
import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Soldier;

import java.util.ArrayList;

public class FEreplicate {
    public static void main(String[] args) {
        System.out.println(1);

        Soldier soldier = new Soldier();
        ChangeableClass<CharacterClass> cc = new ChangeableClass<CharacterClass>();

        cc.addClass(soldier);




    }
}
