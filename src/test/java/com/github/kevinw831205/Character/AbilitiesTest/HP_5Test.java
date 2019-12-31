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
        testCharacter.getCharacterClass().master(testCharacter);

        //then
        Assert.assertTrue(testCharacter.getAbilities().contains(new HP_5()));

        //when
        testCharacter.getAbilities().get(0).equip(testCharacter,0);
        Integer actualHP = testCharacter.getStats().getMaxHP();

        //then
        Assert.assertEquals(new HP_5(),testCharacter.getEquippedAbilities()[0]);
        Assert.assertEquals(Integer.valueOf(10), actualHP);

    }



}
