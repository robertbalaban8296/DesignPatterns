package com.design.patterns.structural.decorator.starbuzz.component.main;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

