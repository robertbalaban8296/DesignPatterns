package com.design.patterns.structural.decorator.starbuzz.decorator.condiment.concrete;

import com.design.patterns.structural.decorator.starbuzz.component.main.Beverage;
import com.design.patterns.structural.decorator.starbuzz.decorator.condiment.concrete.main.CondimentDecorator;

public class MochaDecorator extends CondimentDecorator {

    private Beverage beverage;

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
