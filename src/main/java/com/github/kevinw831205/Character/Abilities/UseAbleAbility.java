package com.github.kevinw831205.Character.Abilities;
import com.github.kevinw831205.Target.*;

public interface UseAbleAbility extends Ability{
    void use(FETarget x);
    int getRange();
}
