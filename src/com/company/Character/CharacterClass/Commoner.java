package com.company.Character.CharacterClass;

import java.util.ArrayList;

public class Commoner implements CharacterClass {

    private ArrayList<CharacterClass> promotables = new ArrayList<CharacterClass>();
    boolean beenPromoted;
    private int classXP;
    private int maxClassXP;

    public Commoner() {
        beenPromoted = false;
    }

    @Override
    public void statBonus() {

    }
}
