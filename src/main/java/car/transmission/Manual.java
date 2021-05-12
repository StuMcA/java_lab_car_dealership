package car.transmission;

public class Manual extends Gearbox {

    private int numberOfGears;
    private int currentGear;

    public Manual(int numberOfGears, int currentGear){
        super(numberOfGears, currentGear);
    }
}
