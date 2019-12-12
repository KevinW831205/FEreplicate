package com.github.kevinw831205.Character;

public class GrowthRateBuilder {
    private Integer hpGrowth;
    private Integer strengthGrowth;
    private Integer magicGrowth;
    private Integer dexterityGrowth;
    private Integer speedGrowth;
    private Integer luckGrowth;
    private Integer defenseGrowth;
    private Integer resistanceGrowth;
    private Integer charmGrowth;

    public GrowthRateBuilder setHPGrowth(Integer hpGrowth) {
        this.hpGrowth = hpGrowth;
        return this;
    }

    public GrowthRateBuilder setStrengthGrowth(Integer strengthGrowth) {
        this.strengthGrowth = strengthGrowth;
        return this;
    }

    public GrowthRateBuilder setMagicGrowth(Integer magicGrowth) {
        this.magicGrowth = magicGrowth;
        return this;
    }

    public GrowthRateBuilder setDexterityGrowth(Integer dexterityGrowth) {
        this.dexterityGrowth = dexterityGrowth;
        return this;
    }

    public GrowthRateBuilder setSpeedGrowth(Integer speedGrowth) {
        this.speedGrowth = speedGrowth;
        return this;
    }

    public GrowthRateBuilder setLuckGrowth(Integer luckGrowth) {
        this.luckGrowth = luckGrowth;
        return this;
    }

    public GrowthRateBuilder setDefenseGrowth(Integer defenseGrowth) {
        this.defenseGrowth = defenseGrowth;
        return this;
    }

    public GrowthRateBuilder setResistanceGrowth(Integer resistanceGrowth) {
        this.resistanceGrowth = resistanceGrowth;
        return this;
    }

    public GrowthRateBuilder setCharmGrowth(Integer charmGrowth) {
        this.charmGrowth = charmGrowth;
        return this;
    }

    public GrowthRate build() {
        return new GrowthRate(hpGrowth, strengthGrowth, magicGrowth, dexterityGrowth, speedGrowth, luckGrowth, defenseGrowth, resistanceGrowth, charmGrowth);
    }
}