package com.github.kevinw831205;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;
import com.github.kevinw831205.Character.CharacterClass.Soldier;
import com.github.kevinw831205.Character.CharacterClass.UniqueClass.Commoner;
import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.StatsBuilder;

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

    public static void main(String[] args) {
        String ss = new StringBuilder()
                .append("Welcome to my application!\n")
                .append("From here, you can elect ay of the following optios")
                .toString();


        Stats s = new StatsBuilder()
                .setCharm(0)
                .setDexterity(1)
                .setLuck(2)
                .createStats();
    }
}
