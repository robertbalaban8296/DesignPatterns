package com.design.patterns.behavioral.strategy.wargame.characters.behaviors.weapons.beans;

import com.design.patterns.behavioral.strategy.wargame.characters.behaviors.weapons.generics.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Knife behavior");
    }
}
