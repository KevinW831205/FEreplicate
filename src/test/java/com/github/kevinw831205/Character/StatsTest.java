package com.github.kevinw831205.Character;

import org.junit.Assert;
import org.junit.Test;

public class StatsTest {

    Stats stats1 = new StatsBuilder()
            .setLevel(1)
            .setMaxHP(30)
            .setStrength(16).setMagic(6)
            .setDexterity(6).setSpeed(12).setLuck(10)
            .setDefense(8).setResistance(7)
            .setCharm(4)
            .setMovement(4)
            .build();
    Stats stats2 = new StatsBuilder()
            .setLevel(5)
            .setMaxHP(30)
            .setStrength(16).setMagic(6)
            .setDexterity(6).setSpeed(12).setLuck(10)
            .setDefense(8).setResistance(7)
            .setCharm(4)
            .setMovement(6)
            .build();

    public void test(int actual, int expected) {

    }


    @Test
    public void AddStatsMaxHpTest1() {
        stats1.addStats(stats2);
        Integer expected = 60;
        Assert.assertEquals(stats1.getMaxHP(), expected);
    }

    @Test
    public void AddStatsMovementTest1() {
        stats1.addStats(stats2);
        Integer expected = 6;
        Assert.assertEquals(stats1.getMovement(), expected);
    }

    @Test
    public void AddStatsTest1() {
        stats1.addStats(stats2);
        Stats expected = new StatsBuilder()
                .setLevel(1)
                .setMaxHP(60)
                .setStrength(32).setMagic(12)
                .setDexterity(12).setSpeed(24).setLuck(20)
                .setDefense(16).setResistance(14)
                .setCharm(8)
                .setMovement(6)
                .build();

        Assert.assertEquals(stats1, expected);
    }


}
