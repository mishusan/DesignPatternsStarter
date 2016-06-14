import io.zipcoder.designpatterns.factory.SodaMachine;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by manjushadas on 6/14/16.
 */
public class SodaMachineTest {
    @Test
    public void sodaIsMadeTest(){
        SodaMachine sodaMachine = new SodaMachine();
        assertNotNull(sodaMachine.dispense());
    }
}
