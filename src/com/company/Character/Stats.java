package com.company.Character;

public class Stats {
    private int level;
    private int healthPoint;
    private int strength;
    private int magic;
    private int dexterity;
    private int speed;
    private int luck;
    private int defense;
    private int resistance;
    private int charisma;
    private int movement;

    public Stats(int level, int healthPoint, int strength, int magic, int dexterity, int speed, int luck, int defense, int resistance, int charisma, int movement) {
        this.level = level;
        this.healthPoint = healthPoint;
        this.strength = strength;
        this.magic = magic;
        this.dexterity = dexterity;
        this.speed = speed;
        this.luck = luck;
        this.defense = defense;
        this.resistance = resistance;
        this.charisma = charisma;
        this.movement = movement;
    }

    public void sumStats(Stats toAdd){
        toAdd.healthPoint = 0;
        return;
    }

    public int getLevel() {
        return level;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getStrength() {
        return strength;
    }

    public int getMagic() {
        return magic;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLuck() {
        return luck;
    }

    public int getDefense() {
        return defense;
    }

    public int getResistance() {
        return resistance;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getMovement() {
        return movement;
    }
}
