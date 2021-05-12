import car.Car;
import car.engine.Hybrid;
import car.transmission.Manual;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.Dealership;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Manual manualGearbox;
    private Hybrid hybridEngine;
    private Car car;
    private Customer customer;
    private Dealership dealership;

    @Before
    public void setUp() {
        manualGearbox = new Manual(5, 1);
        hybridEngine = new Hybrid(150, 1200);
        car = new Car(hybridEngine, manualGearbox, 4, 5000, "Ford", "Fiesta", "Purple");
        customer = new Customer("Chris", 20000);
        dealership = new Dealership("Arnold CodeClan", 100000);

    }

    @Test
    public void canBuy(){
        dealership.buy(car);
        assertEquals(95000, dealership.getTill());
        assertEquals(1, dealership.getCars().size());
    }

    @Test
    public void canSell(){
        dealership.buy(car);
        dealership.sell(car, customer);
        assertEquals(100000, dealership.getTill());
        assertEquals(0, dealership.getCars().size());
        assertEquals(15000, customer.getMoney(), 0.01);
        assertEquals(1, customer.getOwnedCars().size());


    }



}
