package com.github.kevinw831205.Character.Abilities;
import com.github.kevinw831205.Target.*;

public interface UseAbleAbility<TargetType extends FETarget> extends Ability{
    void use(TargetType x);
    int getRange();
}
