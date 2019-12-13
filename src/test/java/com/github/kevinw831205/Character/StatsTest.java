package com.github.kevinw831205.Character;

import org.junit.Assert;
import org.junit.Test;

public class StatsTest {
    private void initialize(){

    }
    GrowthRate gr1 = new GrowthRateBuilder()
            .setHPGrowth(40)
            .setStrengthGrowth(55).setMagicGrowth(45)
            .setDexterityGrowth(45).setSpeedGrowth(40).setLuckGrowth(30)
            .setDefenseGrowth(35).setResistanceGrowth(30)
            .setCharmGrowth(60)
            .build();

    GrowthRate gr2 = new GrowthRateBuilder()
            .setHPGrowth(140)
            .setStrengthGrowth(55).setMagicGrowth(45)
            .setDexterityGrowth(45).setSpeedGrowth(40).setLuckGrowth(30)
            .setDefenseGrowth(35).setResistanceGrowth(30)
            .setCharmGrowth(60)
            .build();
    Stats stats1 = new StatsBuilder()
            .setLevel(1)
            .setMaxHP(30)
            .setStrength(16).setMagic(6)
            .setDexterity(6).setSpeed(12).setLuck(10)
            .setDefense(8).setResistance(7)
            .setCharm(4)
            .setMovement(4)
            .setGrowthRate(gr1)
            .build();
    Stats stats2 = new StatsBuilder()
            .setLevel(5)
            .setMaxHP(30)
            .setStrength(16).setMagic(6)
            .setDexterity(6).setSpeed(12).setLuck(10)
            .setDefense(8).setResistance(7)
            .setCharm(4)
            .setMovement(6)
            .setGrowthRate(gr2)
            .build();
    Stats stats3 = new StatsBuilder()
            .setLevel(3)
            .setMaxHP(10)
            .setStrength(2).setMagic(4)
            .setDexterity(5).setSpeed(1).setLuck(1)
            .setDefense(3).setResistance(4)
            .setCharm(0)
            .setMovement(8)
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

    @Test
    public void SubtractStatsTest1() {
        /*
            Stats stats1 = new StatsBuilder()
            .setLevel(1)
            .setMaxHP(30)
            .setStrength(16).setMagic(6)
            .setDexterity(6).setSpeed(12).setLuck(10)
            .setDefense(8).setResistance(7)
            .setCharm(4)
            .setMovement(4)
            .build();
            Stats stats3 = new StatsBuilder()
            .setLevel(3)
            .setMaxHP(10)
            .setStrength(2).setMagic(4)
            .setDexterity(5).setSpeed(1).setLuck(1)
            .setDefense(3).setResistance(4)
            .setCharm(0)
            .setMovement(8)
            .build();
         */
        stats1.subtractStats(stats3);
        Stats expected = new StatsBuilder()
                .setLevel(1)
                .setMaxHP(20)
                .setStrength(14).setMagic(2)
                .setDexterity(1).setSpeed(11).setLuck(9)
                .setDefense(5).setResistance(3)
                .setCharm(4)
                .setMovement(8)
                .build();
    }

    @Test
    public void growStatsTest(){
        stats1.levelUp();
    }


}
