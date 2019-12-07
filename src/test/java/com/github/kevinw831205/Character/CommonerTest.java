package com.github.kevinw831205.Character;


import com.github.kevinw831205.Character.CharacterClass.UniqueClass.Commoner;
import org.junit.Assert;
import org.junit.Test;

public class CommonerTest {

    // given
    FECharacter TestCharacter  = new FECharacter(
            "TestCharacter",
            new Commoner(),
            null,
            null,
            null,
            null
    );


    @Test
    public void ClassNameTest(){
        String actualName = TestCharacter.getCharacterClass().getClassName();
        String expectedName = "Commoner";
        Assert.assertEquals(actualName,expectedName);
    }

    @Test
    public void BaseStatsTest(){
        Integer actualStats = TestCharacter.getCharacterClass().getBaseStats().getMaxHP();
        Integer expectedStats = 5;
        Assert.assertEquals(actualStats,expectedStats);
    }




}
