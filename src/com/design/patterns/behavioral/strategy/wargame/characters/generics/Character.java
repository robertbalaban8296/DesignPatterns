package com.design.patterns.behavioral.strategy.wargame.characters.generics;

import com.design.patterns.behavioral.strategy.wargame.characters.behaviors.weapons.generics.WeaponBehavior;

public abstract class Character {
    private WeaponBehavior weaponBehavior;

    public abstract void fight();

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
