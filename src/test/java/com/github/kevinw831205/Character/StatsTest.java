package com.github.kevinw831205.Character;

import org.junit.Assert;
import org.junit.Test;

public class StatsTest {

    public void test(String inputName, String expectedName){

        Stats instance = new Stats();

        String actualName = instance.getName();
        Assert.assertEquals(actualName,expectedName);
    }


}
