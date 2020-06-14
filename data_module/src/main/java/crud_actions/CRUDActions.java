package crud_actions;


public interface CRUDActions<AbstractCar> {
    void addCar(AbstractCar car); // CREATE
    AbstractCar getCar(int index); // READ
    void updateCar(int index , AbstractCar car); // UPDATE
    void removeCar(int index); // DELETE
}
