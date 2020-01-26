package com.design.patterns.structural.decorator.starbuzz;

public class SteamedMilkDecorator extends CondimentDecorator {

    private Beverage beverage;

    public SteamedMilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
