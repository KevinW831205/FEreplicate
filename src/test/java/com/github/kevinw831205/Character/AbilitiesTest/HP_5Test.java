package com.github.kevinw831205.Character.AbilitiesTest;

import com.github.kevinw831205.Character.CharacterClass.UniqueClass.Commoner;
import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.StatsBuilder;

public class HP_5Test {

    HP_5Test(){
        //given
        FECharacter testCharacter = new FECharacter("test",new Commoner(),new StatsBuilder().setMaxHP(5).build(), null,null,null);

        //when
        testCharacter.getCharacterClass().mastered();

    }

}
