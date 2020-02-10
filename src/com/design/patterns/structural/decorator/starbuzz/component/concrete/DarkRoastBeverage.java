package com.design.patterns.structural.decorator.starbuzz.component.concrete;

import com.design.patterns.structural.decorator.starbuzz.component.main.Beverage;

public class DarkRoastBeverage extends Beverage {
    @Override
    public double cost() {
        return 0.99;
    }
}
