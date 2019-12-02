package com.design.patterns.behavioral.strategy.ducks.beans;

import com.design.patterns.behavioral.strategy.ducks.main.Duck;

public class RedHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Display the RedHeadDuck");
    }
}
