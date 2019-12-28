package com.github.kevinw831205.Character.Abilities.MasteredAbility;

import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.StatsBuilder;

public class HP_5 extends MasterAbility{
    Stats HP_5Bonus = new StatsBuilder().setMaxHP(5).build();


    @Override
    public void equip(FECharacter target) {
        if(target.getAbilities().contains(this) ){
            target.getAbilities().add(this);
            target.getStats().addStats(this.HP_5Bonus);
        }
    }

    @Override
    public void unEquip(FECharacter target) {
        if(target.getAbilities().contains(this)){
            target.getAbilities().remove(this);
            target.getStats().subtractStats(this.HP_5Bonus);
        }
    }
}
