package com.github.kevinw831205.Character.AbilitiesTest;

import com.github.kevinw831205.Character.Abilities.MasteredAbility.HP_5;
import com.github.kevinw831205.Character.CharacterClass.UniqueClass.Commoner;
import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.StatsBuilder;
import org.junit.Assert;
import org.junit.Test;

public class HP_5Test {

    @Test
    public void Test(){
        //given
        FECharacter testCharacter = new FECharacter("test",new Commoner(),new StatsBuilder().setMaxHP(5).build(), null,null,null);

        //when
        testCharacter.getCharacterClass().mastered(testCharacter.getAbilities(), testCharacter.getArts());

        Assert.assertTrue(testCharacter.getAbilities().contains(new HP_5()));

    }



}
