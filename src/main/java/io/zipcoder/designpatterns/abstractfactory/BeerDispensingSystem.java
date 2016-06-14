package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;
import io.zipcoder.designpatterns.factory.BeerGlassDispenser;
import io.zipcoder.designpatterns.factory.BeerDispenser;

/**
 * Created by manjushadas on 6/13/16.
 */
public class BeerDispensingSystem extends DispensingSystem {
    @Override
    public DrinkDispenser drinkDispenser() {
        return new BeerDispenser();
    }

    @Override
    public CupDispenser cupDispenser() {
        return new BeerGlassDispenser();
    }
}
