package com.design.patterns.structural.decorator.starbuzz;

import com.design.patterns.structural.decorator.starbuzz.Beverage;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
