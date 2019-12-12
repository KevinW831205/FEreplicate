package com.github.kevinw831205.Character;

public class GrowthRate {

    private Byte HPGrowth;
    private Byte strengthGrowth;
    private Byte magicGrowth;
    private Byte dexterityGrowth;
    private Byte speedGrowth;
    private Byte luckGrowth;
    private Byte defenseGrowth;
    private Byte resistanceGrowth;
    private Byte charmGrowth;

    public GrowthRate(Byte HPGrowth, Byte strengthGrowth, Byte magicGrowth, Byte dexterityGrowth, Byte speedGrowth, Byte luckGrowth, Byte defenseGrowth, Byte resistanceGrowth, Byte charmGrowth) {
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

    public GrowthRate(){

    };

    public Byte getHPGrowth() {
        return HPGrowth;
    }

    public Byte getStrengthGrowth() {
        return strengthGrowth;
    }

    public Byte getMagicGrowth() {
        return magicGrowth;
    }

    public Byte getDexterityGrowth() {
        return dexterityGrowth;
    }

    public Byte getSpeedGrowth() {
        return speedGrowth;
    }

    public Byte getLuckGrowth() {
        return luckGrowth;
    }

    public Byte getDefenseGrowth() {
        return defenseGrowth;
    }

    public Byte getResistanceGrowth() {
        return resistanceGrowth;
    }

    public Byte getCharmGrowth() {
        return charmGrowth;
    }
}
