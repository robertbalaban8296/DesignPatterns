package com.design.patterns.structural.decorator.starbuzz.component.concrete;

import com.design.patterns.structural.decorator.starbuzz.component.main.Beverage;

public class HouseBlendBeverege extends Beverage {
    @Override
    public double cost() {
        return 0.89;
    }
}
