package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.Abilities.MasteredAbility.HP_5;
import com.github.kevinw831205.Character.*;

import java.util.List;

public class Commoner extends UniqueClass {
    private Integer masteryXp = 20;

    public Commoner() {
        this(
                "Commoner",
                0,
                0,
                false,
                new StatsBuilder().setMovement(4).build(),
                new GrowthRateBuilder().build()
        );
    }

    public Commoner(String className, Integer classXP, Integer minLevel, boolean hasMaster, Stats baseStats, GrowthRate classGrowthRate) {
        super(className, classXP, minLevel, hasMaster, baseStats, classGrowthRate);
    }

    @Override
    public void mastered(List<Ability> abilities, List<Art> arts) {
        System.out.println("commoner mastered");
        super.mastered(null,null);
        abilities.add(new HP_5());
    }

    @Override
    public Integer getMasteryXp() {
        return this.masteryXp;
    }

    @Override
    public void gainXP(int xp) {
        super.gainXP(xp);
        if(super.getClassXP() >= masteryXp){
            this.mastered();
        }
    }
}
