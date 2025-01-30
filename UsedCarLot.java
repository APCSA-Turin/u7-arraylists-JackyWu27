import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot () {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car c) {
        inventory.add(c);
    }

    public boolean swap (int first, int second) {
        if (first < 0 || first > inventory.size() -1 || second < 0 || second > inventory.size() - 1) {
            return false;
        } else {
            Car temp = inventory.get(second);
            inventory.set(second, inventory.get(first));
            inventory.set(first, temp);
            return true;
        }
    }
}
