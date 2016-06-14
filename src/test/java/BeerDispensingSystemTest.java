import io.zipcoder.designpatterns.abstractfactory.BeerDispensingSystem;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by manjushadas on 6/13/16.
 */
public class BeerDispensingSystemTest {
    @Test
    public void beerGlassDispenserTest(){
        BeerDispensingSystem beerDispensingSystem = new BeerDispensingSystem();
        assertNotNull(beerDispensingSystem.cupDispenser());
    }

    @Test
    public void beerDispenserTest(){
        BeerDispensingSystem beerDispensingSystem = new BeerDispensingSystem();
        assertNotNull(beerDispensingSystem.drinkDispenser());
    }
}
