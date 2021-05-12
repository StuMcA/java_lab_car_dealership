package car.engine;

import behaviours.ICharge;
import behaviours.IRefuel;

public class Hybrid extends Engine implements ICharge, IRefuel {
    private int horsePower;
    private int capacity;

    public Hybrid(int horsePower, int capacity) {
        super(horsePower, capacity);
    }

    public void charge(int watts){
        this.setPower(this.getPower() + (2 * watts));
    }

    public void refuel(int gallons){
        this.setPower(this.getPower() + gallons);
    }
}
