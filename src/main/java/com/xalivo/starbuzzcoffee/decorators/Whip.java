package com.xalivo.starbuzzcoffee.decorators;

import com.xalivo.starbuzzcoffee.pojos.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
