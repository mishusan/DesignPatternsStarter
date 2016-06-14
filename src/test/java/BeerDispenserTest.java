import io.zipcoder.designpatterns.factory.BeerDispenser;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by manjushadas on 6/13/16.
 */
public class BeerDispenserTest {
    @Test
    public void beerDispenserTest(){
        BeerDispenser beerDispenser=new BeerDispenser();
        Assert.assertNotNull(beerDispenser.dispense());
    }
}
