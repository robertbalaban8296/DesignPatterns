package com.design.patterns.behavioral.strategy.ducks.behaviors.beans;

import com.design.patterns.behavioral.strategy.ducks.behaviors.main.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack behavior");
    }
}
