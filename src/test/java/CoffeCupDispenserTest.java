import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by manjushadas on 6/14/16.
 */
public class CoffeCupDispenserTest {

    @Test
    public void coffeeCupDisenserTest(){
        CoffeeCupDispenser coffeeCupDispenser=new CoffeeCupDispenser();
        Assert.assertNotNull(coffeeCupDispenser.dispense());
    }
}
