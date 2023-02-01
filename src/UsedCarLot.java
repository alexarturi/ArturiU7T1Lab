import java.util.*;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int idx1, int idx2){
        if (idx1<0 || idx2<0 || idx1>=inventory.size() || idx2>=inventory.size()){
            return false;
        } else {
            Car car1 = inventory.get(idx1);
            Car car2 = inventory.get(idx2);
            inventory.set(idx2, car1);
            inventory.set(idx1, car2);
            return true;
        }
    }

    public void addCar(int indexToAdd, Car carToAdd){
        inventory.add(indexToAdd, carToAdd);
    }

    public Car sellCarShift(int indexOfCarToSell){
        return inventory.remove(indexOfCarToSell);
    }

    public Car sellCarNoShift(int indexOfCarToSell){
        Car soldCar = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return soldCar;
    }

    public void moveCar(int indexOfCarToMove, int destinationIndex){
        Car movedCar = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, movedCar);
    }
}
