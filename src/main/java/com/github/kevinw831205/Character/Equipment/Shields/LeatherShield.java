package com.github.kevinw831205.Character.Equipment.Shields;

public class LeatherShield extends AbstractShield {
    Integer defense;
    Integer protection;
    Integer weight;
    Integer worth;

    LeatherShield(){
        this();
    }

    public LeatherShield(defense,protection,weight,worth){
        this.defense=defense;
        this.protection=protection;
        this.weight=weight;
        this.worth=worth;
    }

    @Override
    public Character addDefenseEffect() {
        return null;
    }

    @Override
    public Character subtractDefenseEffect() {
        return null;
    }
}
