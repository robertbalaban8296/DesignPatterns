package com.design.patterns.behavioral.strategy.wargame.characters.behaviors.weapons.beans;

import com.design.patterns.behavioral.strategy.wargame.characters.behaviors.weapons.generics.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sword Behavior");
    }
}
