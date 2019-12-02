package com.design.patterns.behavioral.strategy.ducks.main;

import com.design.patterns.behavioral.strategy.ducks.behaviors.main.FlyBehavior;
import com.design.patterns.behavioral.strategy.ducks.behaviors.main.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("The duck is swimming");
    }

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
