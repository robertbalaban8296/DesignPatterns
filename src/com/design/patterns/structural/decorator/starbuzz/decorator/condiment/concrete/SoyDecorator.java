package com.design.patterns.structural.decorator.starbuzz.decorator.condiment.concrete;

import com.design.patterns.structural.decorator.starbuzz.component.main.Beverage;
import com.design.patterns.structural.decorator.starbuzz.decorator.condiment.concrete.main.CondimentDecorator;

public class SoyDecorator extends CondimentDecorator {

    private Beverage beverage;

    public SoyDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
