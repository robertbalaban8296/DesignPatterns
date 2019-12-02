package com.design.patterns.behavioral.strategy.ducks;

import com.design.patterns.behavioral.strategy.ducks.beans.RedHeadDuck;
import com.design.patterns.behavioral.strategy.ducks.beans.RubberDuck;
import com.design.patterns.behavioral.strategy.ducks.behaviors.beans.FlyNoWay;
import com.design.patterns.behavioral.strategy.ducks.behaviors.beans.FlyWithWings;
import com.design.patterns.behavioral.strategy.ducks.main.Duck;

public class MainClass {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck redHeadDuck = new RedHeadDuck();

        redHeadDuck.setFlyBehavior(new FlyWithWings());
        redHeadDuck.performFly();
        redHeadDuck.setFlyBehavior(new FlyNoWay());
        redHeadDuck.performFly();
    }
}
