package com.design.patterns.behavioral.strategy.ducks.behaviors.beans;

import com.design.patterns.behavioral.strategy.ducks.behaviors.main.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FLyNoWay Behavior");
    }
}
