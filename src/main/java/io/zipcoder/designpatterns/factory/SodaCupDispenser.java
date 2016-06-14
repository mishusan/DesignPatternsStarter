package io.zipcoder.designpatterns.factory;

/**
 * Created by manjushadas on 6/13/16.
 */
public class SodaCupDispenser extends CupDispenser {
    @Override
    public SodaCup dispense() {
        return new SodaCup();
    }
}
