package com.github.kevinw831205.Character;

public class StatsBuilder {
    private Integer level;
    private Integer maxHP;
    private Integer strength;
    private Integer magic;
    private Integer dexterity;
    private Integer speed;
    private Integer luck;
    private Integer defense;
    private Integer resistance;
    private Integer charm;
    private Integer movement;
    private GrowthRate growthRate;

    public StatsBuilder setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public StatsBuilder setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
        return this;
    }

    public StatsBuilder setStrength(Integer strength) {
        this.strength = strength;
        return this;
    }

    public StatsBuilder setMagic(Integer magic) {
        this.magic = magic;
        return this;
    }

    public StatsBuilder setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
        return this;
    }

    public StatsBuilder setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    public StatsBuilder setLuck(Integer luck) {
        this.luck = luck;
        return this;
    }

    public StatsBuilder setDefense(Integer defense) {
        this.defense = defense;
        return this;
    }

    public StatsBuilder setResistance(Integer resistance) {
        this.resistance = resistance;
        return this;
    }

    public StatsBuilder setCharm(Integer charm) {
        this.charm = charm;
        return this;
    }

    public StatsBuilder setMovement(Integer movement){
        this.movement = movement;
        return this;
    }

    public StatsBuilder setGrowthRate(GrowthRate growthRate){
        this.growthRate =growthRate;
        return this;
    }

    public Stats build() {
        return new Stats(level, maxHP, strength, magic, dexterity, speed, luck, defense, resistance, charm, movement, growthRate);
    }
}