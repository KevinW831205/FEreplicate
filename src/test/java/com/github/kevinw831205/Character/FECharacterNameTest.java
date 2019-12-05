package com.github.kevinw831205.Character;

import org.junit.Assert;
import org.junit.Test;

class FECharacterNameTest {

    public void test(String inputName, String expectedName){
        FECharacter instance = new FECharacter(inputName);

        String actualName = instance.getName();
        Assert.assertEquals(actualName,expectedName);
    }

    @Test
    public void test1(){
        test("Edelgard","Edelgard");
    }

}
