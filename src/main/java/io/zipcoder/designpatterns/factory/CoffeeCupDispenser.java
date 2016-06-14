package io.zipcoder.designpatterns.factory;

/**
 * Created by manjushadas on 6/13/16.
 */
public class CoffeeCupDispenser extends CupDispenser {
    @Override
    public CoffeeCup dispense() {
        return new CoffeeCup();
    }
}
