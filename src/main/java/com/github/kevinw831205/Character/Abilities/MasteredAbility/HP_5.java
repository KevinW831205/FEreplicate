package com.github.kevinw831205.Character.Abilities.MasteredAbility;

import com.github.kevinw831205.Character.Abilities.StatsModifyAbility;
import com.github.kevinw831205.Character.CharacterClass.Mastery;
import com.github.kevinw831205.Character.Stats;
import com.github.kevinw831205.Character.StatsBuilder;

import java.util.Objects;

public class HP_5 extends StatsModifyAbility implements Mastery {
    String abilityName = "HP+5";
    Stats HP_5Bonus = new StatsBuilder().setMaxHP(5).build();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HP_5 hp_5 = (HP_5) o;
        return Objects.equals(abilityName, hp_5.abilityName) &&
                Objects.equals(HP_5Bonus, hp_5.HP_5Bonus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abilityName, HP_5Bonus);
    }

    @Override
    public String toString() {
        return this.abilityName;
    }

    @Override
    public void equip() {

    }

    @Override
    public void unEquip() {

    }
}
