package com.design.patterns.structural.decorator.starbuzz;

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
