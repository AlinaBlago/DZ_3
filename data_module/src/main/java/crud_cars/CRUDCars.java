package crud_cars;

import car.AbstractCar;
import crud_actions.CRUDActions;

import java.util.ArrayList;

public class CRUDCars implements CRUDActions<AbstractCar> {

    ArrayList<AbstractCar> cars;

    public void addCar(AbstractCar abstractCar) {
        cars.add(abstractCar);
    }

    public AbstractCar getCar(int index) {
        return cars.get(index);
    }

    public void updateCar(int index, AbstractCar abstractCar) {
        cars.add(index, abstractCar);
    }

    public void removeCar(int index) {
        cars.remove(index);
    }

    public ArrayList<AbstractCar> getAllCars(){
        return cars;
    }

    public CRUDCars(){
        cars = new ArrayList<AbstractCar>();
    }

    @Override
    public String toString() {
        String result = "";
        for (AbstractCar car : cars) {
            result += car.toString() + "\n";
        }
        return result;
    }
}
