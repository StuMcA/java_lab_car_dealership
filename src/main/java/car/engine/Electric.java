package car.engine;
import behaviours.ICharge;

public class Electric extends Engine implements ICharge {
    private int horsePower;
    private int capacity;

    public Electric(int horsePower, int capacity) {
        super(horsePower, capacity);
    }


    public void charge(int watts){
        this.setPower(this.getPower() + (2 * watts));
    }


}
