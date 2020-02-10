package com.design.patterns.structural.decorator.starbuzz;

import com.design.patterns.structural.decorator.starbuzz.component.concrete.DecafBeverage;
import com.design.patterns.structural.decorator.starbuzz.component.concrete.EspressoBeverage;
import com.design.patterns.structural.decorator.starbuzz.component.main.Beverage;
import com.design.patterns.structural.decorator.starbuzz.decorator.condiment.concrete.MochaDecorator;
import com.design.patterns.structural.decorator.starbuzz.decorator.condiment.concrete.SoyDecorator;
import com.design.patterns.structural.decorator.starbuzz.decorator.condiment.concrete.SteamedMilkDecorator;

public class MainClass {
    public static void main(String[] args) {
        Beverage espressoBeverage = new EspressoBeverage();
        Beverage espressoWithMilkAndSoy = new SoyDecorator(new SteamedMilkDecorator(espressoBeverage));
        System.out.println(espressoWithMilkAndSoy.cost());
        System.out.println(espressoWithMilkAndSoy.getDescription());

        Beverage decafWithDoubleMochaMilkandSoy =
                new SoyDecorator(
                        new SteamedMilkDecorator(
                                new MochaDecorator(
                                        new MochaDecorator(new DecafBeverage())
                                )
                        )
                );

        System.out.println(decafWithDoubleMochaMilkandSoy.getDescription());
        System.out.println(decafWithDoubleMochaMilkandSoy.cost());
    }
}
