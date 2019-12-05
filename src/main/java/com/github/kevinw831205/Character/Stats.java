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
    private final GrowthRate growthRate = null;

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
