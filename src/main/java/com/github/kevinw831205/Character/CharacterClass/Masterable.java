package com.github.kevinw831205.Character.CharacterClass;

import com.github.kevinw831205.Character.FECharacter;

public interface Masterable {
    void mastered(FECharacter character);
    /*

    Issues:

    FEcharacter has Field that holds Ability and Art
        and Character Class

        Character Class upon master will give and Ability or Art or both
            to the FE Character


        ---------------

        ArrayList<Masterable> getMastery();

        -----

        Art getMasterArt();
        Ability getMasterAbility();

     */
}
