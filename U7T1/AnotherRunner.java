import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {
        Car [] cars = {new Car("car1", 500), new Car("car2", 1000), new Car("car3", 2000)};

        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carList);
    }
}
