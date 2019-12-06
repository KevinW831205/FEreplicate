package com.github.kevinw831205;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Soldier;
import com.github.kevinw831205.Character.CharacterClass.UniqueClass.Commoner;
import com.github.kevinw831205.Character.FECharacter;

public class FEreplicate {
    public static void main(String[] args) {

        FECharacter byleth = new FECharacter(
                "Byleth",
                new Commoner(),
                null,
                null,
                null,
                null
        );
        Soldier soldier = new Soldier();

//        byleth.changeableClass.add(soldier);
        CharacterClass bylethClass =byleth.getCharacterClass();
        String s = bylethClass.getClassName();
        System.out.println(s);


    }

//    public static void main(String[] args) {
//        String ss = new StringBuilder()
//                .append("Welcome to my application!\n")
//                .append("From here, you can elect ay of the following optios")
//                .toString();
//
//
//        Stats s = new StatsBuilder()
//                .setCharm(0)
//                .setDexterity(1)
//                .setLuck(2)
//                .createStats();
//    }



}
