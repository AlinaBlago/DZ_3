import car.AbstractCar;
import car.Audi;
import car.BMW;
import car.Porsche;
import crud_cars.CRUDCars;

public class Main {
    public static void main(String[] args) {

        CRUDCars cars = new CRUDCars();

        BMW m5 = new BMW(AbstractCar.BodyType.Jeep , true , "bmw engine" , "full" , BMW.Series.m5 , false, 2008);
        Audi sportCar = new Audi(AbstractCar.BodyType.Sedan, true, "audi engine", "full", Audi.Series.e_tron, 2020);
        cars.addCar(m5);
        cars.addCar(sportCar);

        Porsche panamera1 = new Porsche(AbstractCar.BodyType.Jeep, true, "8000", "full", Porsche.Series.macan, 2017, true);
        cars.updateCar(0, panamera1);

        System.out.println(cars);
    }
}

