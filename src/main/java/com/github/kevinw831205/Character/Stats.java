package com.github.kevinw831205.Character;

import java.util.Objects;

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
    private Integer movement;
    private GrowthRate growthRate;


    public Stats() {
    }

    public Stats(Integer level, Integer maxHP, Integer strength, Integer magic, Integer dexterity, Integer speed, Integer luck, Integer defense, Integer resistance, Integer charm, Integer movement, GrowthRate growthRate) {
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
        this.movement = movement;
        this.growthRate = growthRate;
    }


    public void levelUp() {
        this.level++;
        growAllStats();
    }

    private void growAllStats() {
        this.maxHP =  growStats(maxHP, growthRate.getHPGrowth());
        this.strength = growStats(strength, growthRate.getStrengthGrowth());
        this.magic = growStats(magic, growthRate.getMagicGrowth());
        this.dexterity =  growStats(dexterity, growthRate.getDexterityGrowth());
        this.speed = growStats(speed, growthRate.getSpeedGrowth());
        this.luck = growStats(luck, growthRate.getLuckGrowth());
        this.defense =  growStats(defense, growthRate.getDefenseGrowth());
        this.resistance = growStats(resistance, growthRate.getResistanceGrowth());
        this.charm = growStats(charm, growthRate.getCharmGrowth());
    }

    private Integer growStats(Integer stats, Integer growthRate) {
        if (growthRate > 255) {
            growthRate = 255;
        }
        while (growthRate > 100) {
            stats++;
            growthRate = (growthRate - 100);
        }
        if (statShouldGrow(growthRate)) {
            stats++;
        }
        return stats;
    }

    private boolean statShouldGrow(Integer probability){
        return  getRandomInteger() < probability;
    }

    private Integer getRandomInteger() {
        return (int) (Math.random() * 100);
    }

    public void growTest(Integer probability, Integer iterations){
        int countTrue = 0;
        int countFalse = 0;

        for(int i=0; i<iterations; i++){
            if(statShouldGrow(probability)){
                countTrue++;
            } else {
                countFalse++;
            }
        }
        System.out.println("True "+countTrue+"\nFalse "+countFalse);
    }

    public void addStats(Stats stats) {
        if (stats.maxHP != null) {
            this.maxHP += stats.maxHP;
        }

        if (stats.strength != null) {
            this.strength += stats.strength;
        }

        if (stats.magic != null) {
            this.magic += stats.magic;
        }

        if (stats.dexterity != null) {
            this.dexterity += stats.dexterity;
        }

        if (stats.speed != null) {
            this.speed += stats.speed;
        }

        if (stats.luck != null) {
            this.luck += stats.luck;
        }

        if (stats.defense != null) {
            this.defense += stats.defense;
        }

        if (stats.resistance != null) {
            this.resistance += stats.resistance;
        }

        if (stats.charm != null) {
            this.charm += stats.charm;
        }

        if (stats.movement != null) {
            this.movement = stats.movement;
        }
    }

    public void subtractStats(Stats stats) {
        if (stats.maxHP != null) {
            this.maxHP -= stats.maxHP;
        }

        if (stats.strength != null) {
            this.strength -= stats.strength;
        }

        if (stats.magic != null) {
            this.magic -= stats.magic;
        }

        if (stats.dexterity != null) {
            this.dexterity -= stats.dexterity;
        }

        if (stats.speed != null) {
            this.speed -= stats.speed;
        }

        if (stats.luck != null) {
            this.luck -= stats.luck;
        }

        if (stats.defense != null) {
            this.defense -= stats.defense;
        }

        if (stats.resistance != null) {
            this.resistance -= stats.resistance;
        }

        if (stats.charm != null) {
            this.charm -= stats.charm;
        }

        if (stats.movement != null) {
            this.movement = stats.movement;
        }
    }


    @Override
    public String toString() {
        return new StringBuilder()
                .append("\nLevel : " + this.level)
                .append("\nMaxHP: " + this.maxHP)
                .append("\nStrength: " + this.strength)
                .append("\nMagic: " + this.magic)
                .append("\nDex: " + this.dexterity)
                .append("\nSpeed: " + this.speed)
                .append("\nLuck: " + this.luck)
                .append("\nDef: " + this.defense)
                .append("\nRes: " + this.resistance)
                .append("\nCharm: " + this.charm)
                .append("\nMovement: " + this.movement)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return Objects.equals(level, stats.level) &&
                Objects.equals(maxHP, stats.maxHP) &&
                Objects.equals(strength, stats.strength) &&
                Objects.equals(magic, stats.magic) &&
                Objects.equals(dexterity, stats.dexterity) &&
                Objects.equals(speed, stats.speed) &&
                Objects.equals(luck, stats.luck) &&
                Objects.equals(defense, stats.defense) &&
                Objects.equals(resistance, stats.resistance) &&
                Objects.equals(charm, stats.charm) &&
                Objects.equals(movement, stats.movement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, maxHP, strength, magic, dexterity, speed, luck, defense, resistance, charm, movement);
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public GrowthRate getGrowthRate() {
        return growthRate;
    }

    public Integer getLevel() {
        return level;
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

    public Integer getMovement() {
        return movement;
    }
}
