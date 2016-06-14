import io.zipcoder.designpatterns.factory.BeerGlassDispenser;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by manjushadas on 6/14/16.
 */
public class BeerGlassDispenseTest {

        @Test
        public void beerGlassCreatedTest(){
            BeerGlassDispenser beerGlassDispenser = new BeerGlassDispenser();
            assertNotNull(beerGlassDispenser.dispense());
        }

    }

