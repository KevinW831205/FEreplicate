package com.github.kevinw831205.Character;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "GrowthRate{" +
                "\nHPGrowth=" + HPGrowth + "%" +
                "\nstrengthGrowth=" + strengthGrowth + "%" +
                "\nmagicGrowth=" + magicGrowth + "%" +
                "\ndexterityGrowth=" + dexterityGrowth + "%" +
                "\nspeedGrowth=" + speedGrowth + "%" +
                "\nluckGrowth=" + luckGrowth + "%" +
                "\ndefenseGrowth=" + defenseGrowth + "%" +
                "\nresistanceGrowth=" + resistanceGrowth + "%" +
                "\ncharmGrowth=" + charmGrowth + "%" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrowthRate that = (GrowthRate) o;
        return Objects.equals(HPGrowth, that.HPGrowth) &&
                Objects.equals(strengthGrowth, that.strengthGrowth) &&
                Objects.equals(magicGrowth, that.magicGrowth) &&
                Objects.equals(dexterityGrowth, that.dexterityGrowth) &&
                Objects.equals(speedGrowth, that.speedGrowth) &&
                Objects.equals(luckGrowth, that.luckGrowth) &&
                Objects.equals(defenseGrowth, that.defenseGrowth) &&
                Objects.equals(resistanceGrowth, that.resistanceGrowth) &&
                Objects.equals(charmGrowth, that.charmGrowth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(HPGrowth, strengthGrowth, magicGrowth, dexterityGrowth, speedGrowth, luckGrowth, defenseGrowth, resistanceGrowth, charmGrowth);
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

    public void addGrowthRate(GrowthRate gr){
        if(gr.HPGrowth != null){
            this.HPGrowth += gr.HPGrowth;
        }
        if(gr.strengthGrowth != null){
            this.strengthGrowth += gr.strengthGrowth;
        }
        if(gr.magicGrowth != null){
            this.magicGrowth += gr.magicGrowth;
        }
        if(gr.dexterityGrowth !=null){
            this.dexterityGrowth += gr.dexterityGrowth;
        }
        if(gr.speedGrowth !=null){
            this.speedGrowth += gr.speedGrowth;
        }
        if(gr.luckGrowth !=null){
            this.luckGrowth += gr.luckGrowth;
        }
        if(gr.defenseGrowth !=null){
            this.defenseGrowth += gr.defenseGrowth;
        }
        if(gr.resistanceGrowth !=null){
            this.resistanceGrowth += gr.resistanceGrowth;
        }
        if(gr.charmGrowth !=null){
            this.charmGrowth += gr.charmGrowth;
        }
    }

    public void subtractGrowthRate(GrowthRate gr){
        if(gr.HPGrowth != null){
            this.HPGrowth -= gr.HPGrowth;
        }
        if(gr.strengthGrowth != null){
            this.strengthGrowth -= gr.strengthGrowth;
        }
        if(gr.magicGrowth != null){
            this.magicGrowth -= gr.magicGrowth;
        }
        if(gr.dexterityGrowth !=null){
            this.dexterityGrowth -= gr.dexterityGrowth;
        }
        if(gr.speedGrowth !=null){
            this.speedGrowth -= gr.speedGrowth;
        }
        if(gr.luckGrowth !=null){
            this.luckGrowth -= gr.luckGrowth;
        }
        if(gr.defenseGrowth !=null){
            this.defenseGrowth -= gr.defenseGrowth;
        }
        if(gr.resistanceGrowth !=null){
            this.resistanceGrowth -= gr.resistanceGrowth;
        }
        if(gr.charmGrowth !=null){
            this.charmGrowth -= gr.charmGrowth;
        }
    }

}
