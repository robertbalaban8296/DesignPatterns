package com.design.patterns.behavioral.strategy.ducks.behaviors.beans;

import com.design.patterns.behavioral.strategy.ducks.behaviors.main.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak behavior");
    }
}
