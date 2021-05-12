import car.transmission.Manual;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearboxTest {

    private Manual manualGearbox;

    @Before
    public void setUp(){
        manualGearbox = new Manual(5, 1);
    }

    @Test
    public void canChangeGears(){
        manualGearbox.changeGear(2);
        assertEquals(2, manualGearbox.getCurrentGear());
    }
}
