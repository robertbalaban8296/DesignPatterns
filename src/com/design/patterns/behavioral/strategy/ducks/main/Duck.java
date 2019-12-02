package com.design.patterns.behavioral.strategy.ducks.main;

import com.design.patterns.behavioral.strategy.ducks.behaviors.main.FlyBehavior;
import com.design.patterns.behavioral.strategy.ducks.behaviors.main.QuackBehavior;

/**
 * This is a generic class. All ducks should have these properties and behaviors
 * */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    /**
     * This method should be overriden by all subclasses because is specific for each duck
     * */
    public abstract void display();

    /**
     * The default behavior of swiming is this. If a duck want to change this, it can be easy overriden
     * */
    public void swim() {
        System.out.println("The duck is swimming");
    }

    /**
     * This method is part of strategy pattern. It calls the method of the behavior
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
