package com.design.patterns.behavioral.strategy.wargame.characters;

import com.design.patterns.behavioral.strategy.wargame.characters.beans.Knight;
import com.design.patterns.behavioral.strategy.wargame.characters.generics.Character;
import com.design.patterns.behavioral.strategy.wargame.characters.behaviors.weapons.beans.AxeBehavior;
import com.design.patterns.behavioral.strategy.wargame.characters.behaviors.weapons.beans.SwordBehavior;

public class MainClass {
    public static void main(String[] args) {
        Character knight = new Knight();
        knight.setWeaponBehavior(new SwordBehavior());
        knight.fight();
        knight.setWeaponBehavior(new AxeBehavior());
        knight.fight();
    }
}
