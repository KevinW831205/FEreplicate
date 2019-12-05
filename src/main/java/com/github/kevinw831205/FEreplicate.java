package com.github.kevinw831205;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Soldier;
import com.github.kevinw831205.Character.CharacterClass.UniqueClass.Commoner;
import com.github.kevinw831205.Character.FECharacter;

public class FEreplicate {
    public static void main(String[] args) {
        System.out.println(1);

        FECharacter byleth = new FECharacter(
                "Byleth",
                new Commoner(null, null, null, null),
                null,
                null,
                null,
                null
        );
        Soldier soldier = new Soldier();

        byleth.changeableClass.add(soldier);



    }
}
