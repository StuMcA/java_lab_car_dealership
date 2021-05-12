package people;

import java.util.ArrayList;

import behaviours.IBuy;
import car.Car;

public class Customer implements IBuy {

    private String name;
    private double money;
    private ArrayList<Car> ownedCars;

    public Customer(String name, double money){
        this.name = name;
        this.money = money;
        this.ownedCars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public void setOwnedCars(ArrayList<Car> ownedCars) {
        this.ownedCars = ownedCars;
    }

    public void buy(Car car){
        this.ownedCars.add(car);
        this.money -= car.getPrice();
    }
}
