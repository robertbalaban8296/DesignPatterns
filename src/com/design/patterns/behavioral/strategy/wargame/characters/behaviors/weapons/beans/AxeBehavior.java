package com.design.patterns.behavioral.strategy.wargame.characters.behaviors.weapons.beans;

import com.design.patterns.behavioral.strategy.wargame.characters.behaviors.weapons.generics.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Axe Behavior");
    }
}
