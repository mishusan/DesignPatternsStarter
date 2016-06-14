import io.zipcoder.designpatterns.factory.SodaCupDispenser;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by manjushadas on 6/14/16.
 */
public class SodaCupDispenserTEst {
    @Test
            public  void sodaCupDispenerTEst() {

        SodaCupDispenser sodaCupDispenser = new SodaCupDispenser();
        Assert.assertNotNull(sodaCupDispenser.dispense());
    }
}
