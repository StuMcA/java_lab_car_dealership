package car.engine;

import behaviours.IEngine;

public abstract class Engine implements IEngine {

    private int horsePower;
    private int capacity;
    private int power;

    public Engine(int horsePower, int capacity) {
        this.horsePower = horsePower;
        this.capacity = capacity;
        this.power = 0;
    }

    public String start(){
        return "Brrrrrr";
    }

    public String stop(){
        return ".....";
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
