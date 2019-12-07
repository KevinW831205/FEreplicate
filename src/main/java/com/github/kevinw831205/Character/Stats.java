package com.github.kevinw831205.Character;

public class Stats {

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
    private GrowthRate growthRate;



    public Stats(Integer level, Integer maxHP, Integer strength, Integer magic, Integer dexterity, Integer speed, Integer luck, Integer defense, Integer resistance, Integer charm, GrowthRate growthRate) {
        this.level = level;
        this.maxHP = maxHP;
        this.strength = strength;
        this.magic = magic;
        this.dexterity = dexterity;
        this.speed = speed;
        this.luck = luck;
        this.defense = defense;
        this.resistance = resistance;
        this.charm = charm;
        this.growthRate = growthRate;
    }

    public GrowthRate getGrowthRate() {
        return growthRate;
    }

    public Integer getLevel() {
        return level;
    }

    public void levelUp(){
        this.level++;
    }

    public void addStats(Stats stats){
        speed += stats.speed;
    }

    public void subtractStats(Stats stats){

    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getMagic() {
        return magic;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getLuck() {
        return luck;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getResistance() {
        return resistance;
    }

    public Integer getCharm() {
        return charm;
    }
}
