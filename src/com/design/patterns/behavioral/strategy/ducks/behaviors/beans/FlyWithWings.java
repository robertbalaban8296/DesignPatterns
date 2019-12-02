package com.design.patterns.behavioral.strategy.ducks.behaviors.beans;

import com.design.patterns.behavioral.strategy.ducks.behaviors.main.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This is the FlyWithWings Behavior");
    }
}
