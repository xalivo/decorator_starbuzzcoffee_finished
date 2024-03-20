package com.xalivo.starbuzzcoffee.pojos;

// this is the Component class
public abstract class Beverage {
    String description = "Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
