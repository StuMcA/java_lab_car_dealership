package car.transmission;

import behaviours.ITransmission;

public abstract class Gearbox implements ITransmission {

    private int numberOfGears;
    private int currentGear;

    public Gearbox(int numberOfGears, int currentGear) {
        this.numberOfGears = numberOfGears;
        this.currentGear = currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void changeGear(int gear){
        this.setCurrentGear(gear);
    }
}
