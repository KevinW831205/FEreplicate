package com.github.kevinw831205.Character;

import org.junit.Assert;
import org.junit.Test;

public class StatsTest {

    StatsBuilder stats1Builder = new StatsBuilder();
    StatsBuilder stats2Builder = new StatsBuilder();



    public void test(int actual, int expected) {

    }


    @Test
    public void AddStatsTest(){
        stats1Builder.setMaxHP(10);
        stats2Builder.setMaxHP(5);
        Stats stats1=  stats1Builder.build();
        Stats stats2=  stats2Builder.build();
        stats1.addStats(stats2);
        Integer expected =15;

        Assert.assertEquals(stats1.getMaxHP(), expected);

    }




}
