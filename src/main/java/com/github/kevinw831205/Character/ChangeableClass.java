package com.github.kevinw831205.Character;

import com.github.kevinw831205.Character.CharacterClass.CharacterClass;

import java.util.ArrayList;

public class ChangeableClass<T extends CharacterClass> {
    private ArrayList<T> classes = new ArrayList<>();

    public boolean addClass(T c){
        if(classes.contains(c)){
            System.out.println("Error");
            return false;
        } else {
            classes.add(c);
            System.out.println(c.getClassName() +" is added");
            return true;
        }
    }

}
