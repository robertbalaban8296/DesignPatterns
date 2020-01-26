package com.design.patterns.structural.decorator.starbuzz;

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
