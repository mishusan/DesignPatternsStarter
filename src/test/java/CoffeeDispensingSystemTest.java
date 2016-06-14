import io.zipcoder.designpatterns.abstractfactory.CoffeeDispensingSystem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by manjushadas on 6/14/16.
 */
public class CoffeeDispensingSystemTest {
    @Test
    public void coffeeDispensingSystemDrinkTest(){
        CoffeeDispensingSystem coffeeDispensingSystem = new CoffeeDispensingSystem();
        assertNotNull(coffeeDispensingSystem.drinkDispenser());
    }

    @Test
    public void coffeeDispensingSystemCupTest(){
        CoffeeDispensingSystem coffeeDispensingSystem = new CoffeeDispensingSystem();
        assertNotNull(coffeeDispensingSystem.cupDispenser());
    }


}
