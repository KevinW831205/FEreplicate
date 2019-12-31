package com.github.kevinw831205.Character;


import com.github.kevinw831205.Character.CharacterClass.UniqueClass.Commoner;
import org.junit.Assert;
import org.junit.Test;

public class CommonerTest {

    // given
    FECharacter createTestCharacter() {
       return new FECharacter(
                "TestCharacter",
                new Commoner(),
                null,
                null,
                null,
                null
        );
    }


    @Test
    public void ClassNameTest() {
        FECharacter testCharacter = createTestCharacter();
        String actualName = testCharacter.getCharacterClass().getClassName();
        String expectedName = "Commoner";
        Assert.assertEquals(actualName, expectedName);

    }

    @Test
    public void BaseStatsMvTest() {
        FECharacter testCharacter = createTestCharacter();
        Integer actualStats = testCharacter.getCharacterClass().getBaseStats().getMovement();
        Integer expectedStats = 4;
        Assert.assertEquals(actualStats, expectedStats);
    }

    @Test
    public void BaseStatsHpTest() {
        FECharacter testCharacter = createTestCharacter();
        Integer actualStats = testCharacter.getCharacterClass().getBaseStats().getMaxHP();
        Integer expectedStats = null;
        Assert.assertEquals(actualStats, expectedStats);
    }

    public void gainXpTest(Integer... xps) {
        //given
        FECharacter testCharacter = createTestCharacter();

        //when
        Integer expected = 0;
        for(Integer xp : xps){
            expected += xp;
            testCharacter.getCharacterClass().gainXP(xp);
        }

        Integer actualXp = testCharacter.getCharacterClass().getClassXP();

        //Then

        Assert.assertEquals(expected,actualXp);
    }

    @Test
    public void gainXpTest1(){
        gainXpTest(5,10);

    }


}
