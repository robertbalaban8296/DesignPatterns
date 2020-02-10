package com.design.patterns.structural.decorator.starbuzz.decorator.condiment.concrete;

import com.design.patterns.structural.decorator.starbuzz.component.main.Beverage;
import com.design.patterns.structural.decorator.starbuzz.decorator.condiment.concrete.main.CondimentDecorator;

public class WhipDecorator extends CondimentDecorator {

    private Beverage beverage;

    public WhipDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
