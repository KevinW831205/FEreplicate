package com.github.kevinw831205.Character.CharacterClass.Masteries;

import com.github.kevinw831205.Character.CharacterClass.Masteries.MasterAbility.MasterAbility;
import com.github.kevinw831205.Character.CharacterClass.Masteries.MasterArt.MasterArt;

public interface Mastery {

    MasterAbility getMasteredAbility();
    MasterArt getMasteredArt();
    void Mastered();

}
