package car;

import behaviours.IEngine;
import behaviours.ITransmission;

public class Car {

    private IEngine engine;
    private ITransmission gearbox;
    private int numberOfDoors;
    private double price;
    private String make;
    private String model;
    private String colour;

    public Car(IEngine engine, ITransmission gearbox, int numberOfDoors, double price, String make, String model, String colour){
        this.engine = engine;
        this.gearbox = gearbox;
        this.numberOfDoors = numberOfDoors;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    public IEngine getEngine() {
        return engine;
    }

    public ITransmission getGearbox() {
        return gearbox;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void setGearbox(ITransmission gearbox) {
        this.gearbox = gearbox;
    }
}
