import car.engine.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Petrol petrolEngine;

    @Before
    public void setUp(){
        petrolEngine = new Petrol(200, 2000);
    }

    @Test
    public void canStart(){
        assertEquals("Brrrrrr", petrolEngine.start());
    }

    @Test
    public void canStop(){
        assertEquals(".....", petrolEngine.stop());
    }

}
