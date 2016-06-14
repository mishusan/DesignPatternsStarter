import org.junit.Assert;
import org.junit.Test;
import io.zipcoder.designpatterns.factory.CoffeeMachine;
/**
 * Created by manjushadas on 6/13/16.
 */
public class CoffeeMachineTest {
    @Test

    public void coffeeDispenseTest(){
        CoffeeMachine coffeeMachine=new CoffeeMachine();
        Assert.assertNotNull(coffeeMachine.dispense());
    }


}
