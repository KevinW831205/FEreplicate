package com.github.kevinw831205.Character;

public class GrowthRateBuilder {
    private Byte hpGrowth;
    private Byte strengthGrowth;
    private Byte magicGrowth;
    private Byte dexterityGrowth;
    private Byte speedGrowth;
    private Byte luckGrowth;
    private Byte defenseGrowth;
    private Byte resistanceGrowth;
    private Byte charmGrowth;

    public GrowthRateBuilder setHPGrowth(Byte hpGrowth) {
        this.hpGrowth = hpGrowth;
        return this;
    }

    public GrowthRateBuilder setStrengthGrowth(Byte strengthGrowth) {
        this.strengthGrowth = strengthGrowth;
        return this;
    }

    public GrowthRateBuilder setMagicGrowth(Byte magicGrowth) {
        this.magicGrowth = magicGrowth;
        return this;
    }

    public GrowthRateBuilder setDexterityGrowth(Byte dexterityGrowth) {
        this.dexterityGrowth = dexterityGrowth;
        return this;
    }

    public GrowthRateBuilder setSpeedGrowth(Byte speedGrowth) {
        this.speedGrowth = speedGrowth;
        return this;
    }

    public GrowthRateBuilder setLuckGrowth(Byte luckGrowth) {
        this.luckGrowth = luckGrowth;
        return this;
    }

    public GrowthRateBuilder setDefenseGrowth(Byte defenseGrowth) {
        this.defenseGrowth = defenseGrowth;
        return this;
    }

    public GrowthRateBuilder setResistanceGrowth(Byte resistanceGrowth) {
        this.resistanceGrowth = resistanceGrowth;
        return this;
    }

    public GrowthRateBuilder setCharmGrowth(Byte charmGrowth) {
        this.charmGrowth = charmGrowth;
        return this;
    }

    public GrowthRate build() {
        return new GrowthRate(hpGrowth, strengthGrowth, magicGrowth, dexterityGrowth, speedGrowth, luckGrowth, defenseGrowth, resistanceGrowth, charmGrowth);
    }
}