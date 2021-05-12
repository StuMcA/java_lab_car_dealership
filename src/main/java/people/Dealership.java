package people;

import behaviours.IBuy;
import car.Car;

import java.util.ArrayList;

public class Dealership implements IBuy {

    String name;
    ArrayList<Car> cars;
    int till;

    public Dealership(String name, int till) {
        this.name = name;
        this.cars = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public void buy(Car car){
        this.cars.add(car);
        this.till -= car.getPrice();
    }

    public void sell(Car car, Customer customer){
        this.cars.remove(car);
        customer.buy(car);
        this.till += car.getPrice();
    }


}
