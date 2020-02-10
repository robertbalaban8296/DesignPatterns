package com.design.patterns.structural.decorator.starbuzz.decorator.condiment.concrete.main;

import com.design.patterns.structural.decorator.starbuzz.component.main.Beverage;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
