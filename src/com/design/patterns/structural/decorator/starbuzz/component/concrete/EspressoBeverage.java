package com.design.patterns.structural.decorator.starbuzz.component.concrete;

import com.design.patterns.structural.decorator.starbuzz.component.main.Beverage;

public class EspressoBeverage extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }
}
