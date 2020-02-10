package com.design.patterns.structural.decorator.starbuzz.component.concrete;

import com.design.patterns.structural.decorator.starbuzz.component.main.Beverage;

public class DecafBeverage extends Beverage {
    @Override
    public double cost() {
        return 1.05;
    }
}
