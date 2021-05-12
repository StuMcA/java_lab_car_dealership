package car.engine;

import behaviours.IRefuel;

public class Petrol extends Engine implements IRefuel {

    private int horsePower;
    private int capacity;

    public Petrol(int horsePower, int capacity){
        super(horsePower, capacity);
    }

    public void refuel(int gallons){
        this.setPower(this.getPower() + gallons);
    }
}
