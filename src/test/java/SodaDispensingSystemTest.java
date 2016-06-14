
import io.zipcoder.designpatterns.abstractfactory.SodaDispensingSystem;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by manjushadas on 6/14/16.
 */
public class SodaDispensingSystemTest {
    @Test
    public void sodaMachineDispenserTest(){
        SodaDispensingSystem sodaDispensingSystem = new SodaDispensingSystem();
        assertNotNull(sodaDispensingSystem.drinkDispenser());
    }

    @Test
    public void sodaCupDispenserTest(){
        SodaDispensingSystem sodaDispensingSystem = new SodaDispensingSystem();
        assertNotNull(sodaDispensingSystem.cupDispenser());
    }

}
