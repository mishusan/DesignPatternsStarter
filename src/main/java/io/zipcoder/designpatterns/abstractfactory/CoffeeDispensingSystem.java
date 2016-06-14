package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.CoffeeMachine;
import io.zipcoder.designpatterns.factory.DrinkDispenser;
import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;

public  class CoffeeDispensingSystem{
    public DrinkDispenser drinkDispenser(){
        return new CoffeeMachine(); }

    //Uncomment after part 1 is done
    public CupDispenser cupDispenser(){
        return new CoffeeCupDispenser();
    }

}
