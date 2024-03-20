package com.xalivo.starbuzzcoffee;

import com.xalivo.starbuzzcoffee.decorators.Discount;
import com.xalivo.starbuzzcoffee.decorators.Mocha;
import com.xalivo.starbuzzcoffee.decorators.Soy;
import com.xalivo.starbuzzcoffee.decorators.Whip;
import com.xalivo.starbuzzcoffee.pojos.Beverage;
import com.xalivo.starbuzzcoffee.pojos.DarkRoast;
import com.xalivo.starbuzzcoffee.pojos.Espresso;


public class Main {

    public static void printBeverage(Beverage beverage) {
        System.out.printf("%s: %.2f €\n", beverage.getDescription(), beverage.cost());
    }

    public static void main(String[] args) {
        // Dark Roast with Mocha & Whip
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        printBeverage(beverage);

        // Espresso with Mocha, Whip, Soy & 10% off
        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Discount(beverage2, 10);
        printBeverage(beverage2);
    }
}
