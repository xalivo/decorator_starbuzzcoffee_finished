package com.xalivo.starbuzzcoffee.decorators;

import com.xalivo.starbuzzcoffee.pojos.Beverage;

// this class is the Decorator class
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

    public abstract double cost();
}
