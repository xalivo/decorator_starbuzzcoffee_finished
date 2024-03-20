package com.xalivo.starbuzzcoffee.decorators;

import com.xalivo.starbuzzcoffee.pojos.Beverage;

public class Discount extends CondimentDecorator {

    private int discountInPercent = 0;

    public Discount(Beverage beverage, int discountInPercent) {
        this.beverage = beverage;
        this.discountInPercent = discountInPercent;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with " + discountInPercent + "% discount";
    }

    @Override
    public double cost() {
        return beverage.cost() - (beverage.cost() * discountInPercent/100);
    }
}
