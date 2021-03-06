//package com.github.kevinw831205.Character.Equip;
//
//import com.github.kevinw831205.Character.Abilities.Ability;
//import com.github.kevinw831205.Character.Abilities.OpenSlot;
//import com.github.kevinw831205.Character.FECharacter;
//
//import java.util.Arrays;
//
//public class EquippedAbilities {
//
//    //refactor to have this class modify state of character instead
//    Ability[] equippedAbilities = new Ability[5];
//
//    public EquippedAbilities() {
//        this(new OpenSlot(), new OpenSlot(), new OpenSlot(), new OpenSlot(), new OpenSlot());
//    }
//
//    public EquippedAbilities(Ability ability1, Ability ability2, Ability ability3, Ability ability4, Ability ability5) {
//        equippedAbilities[0] = ability1;
//        equippedAbilities[1] = ability2;
//        equippedAbilities[2] = ability3;
//        equippedAbilities[3] = ability4;
//        equippedAbilities[4] = ability5;
//    }
//
//    public void equipAbility(FECharacter target, Ability ability, int slot) {
//        if(slot<1 || slot>5){
//            System.out.println("Invalid equip");
//            return;
//        }
//        slot = slot-1;
//        equippedAbilities[slot].onUnEquip();
//        equippedAbilities[slot] = ability;
//        ability.onEquip();
//    }
//
//    public Ability slot(int slot){
//        return equippedAbilities[slot-1];
//    }
//
//    @Override
//    public String toString() {
//        return "EquippedAbilities{" +
//                "equippedAbilities=" + Arrays.toString(equippedAbilities) +
//                '}';
//    }
//}
