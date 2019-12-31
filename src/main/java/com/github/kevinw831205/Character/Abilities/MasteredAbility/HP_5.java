package com.github.kevinw831205.Character.Abilities.MasteredAbility;

import com.github.kevinw831205.Character.FECharacter;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.StatsBuilder;

import java.util.Objects;

public class HP_5 extends MasteredAbility {
    Stats HP_5Bonus = new StatsBuilder().setMaxHP(5).build();

    @Override
    public void equip(FECharacter target) {
        if(target.getAbilities().contains(this)){
            target.getStats().addStats(this.HP_5Bonus);
        }
    }

    @Override
    public void unEquip(FECharacter target) {
        if(target.getAbilities().contains(this)){
            target.getStats().subtractStats(this.HP_5Bonus);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HP_5 hp_5 = (HP_5) o;
        return Objects.equals(HP_5Bonus, hp_5.HP_5Bonus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(HP_5Bonus);
    }
}
