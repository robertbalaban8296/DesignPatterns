package com.design.patterns.behavioral.strategy.wargame.characters.beans;

import com.design.patterns.behavioral.strategy.wargame.characters.generics.Character;

public class Knight extends Character {
    @Override
    public void fight() {
        System.out.println("The Knight is fighting and using:");
        getWeaponBehavior().useWeapon();
    }
}
