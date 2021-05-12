import car.engine.Hybrid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    private Hybrid hybridEngine;

    @Before
    public void setUp() {
        hybridEngine = new Hybrid(150, 1200);
    }

    @Test
    public void canCharge() {
        hybridEngine.charge(50);
        assertEquals(100, hybridEngine.getPower());
    }

    @Test
    public void canRefuel() {
        hybridEngine.refuel(50);
        assertEquals(50, hybridEngine.getPower());
    }
}
