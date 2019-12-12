package com.github.kevinw831205.Character;

public class GrowthRate {

    private Integer HPGrowth;
    private Integer strengthGrowth;
    private Integer magicGrowth;
    private Integer dexterityGrowth;
    private Integer speedGrowth;
    private Integer luckGrowth;
    private Integer defenseGrowth;
    private Integer resistanceGrowth;
    private Integer charmGrowth;

    public GrowthRate(Integer HPGrowth, Integer strengthGrowth, Integer magicGrowth, Integer dexterityGrowth, Integer speedGrowth, Integer luckGrowth, Integer defenseGrowth, Integer resistanceGrowth, Integer charmGrowth) {
        this.HPGrowth = HPGrowth;
        this.strengthGrowth = strengthGrowth;
        this.magicGrowth = magicGrowth;
        this.dexterityGrowth = dexterityGrowth;
        this.speedGrowth = speedGrowth;
        this.luckGrowth = luckGrowth;
        this.defenseGrowth = defenseGrowth;
        this.resistanceGrowth = resistanceGrowth;
        this.charmGrowth = charmGrowth;
    }


    public Integer getHPGrowth() {
        return HPGrowth;
    }

    public Integer getStrengthGrowth() {
        return strengthGrowth;
    }

    public Integer getMagicGrowth() {
        return magicGrowth;
    }

    public Integer getDexterityGrowth() {
        return dexterityGrowth;
    }

    public Integer getSpeedGrowth() {
        return speedGrowth;
    }

    public Integer getLuckGrowth() {
        return luckGrowth;
    }

    public Integer getDefenseGrowth() {
        return defenseGrowth;
    }

    public Integer getResistanceGrowth() {
        return resistanceGrowth;
    }

    public Integer getCharmGrowth() {
        return charmGrowth;
    }
}
