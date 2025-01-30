public class Car {
    private String model;
    private int miles;

    public Car (String mo, int mi) {
        miles = mi;
        model = mo;
    }

    public String toString() {
        return model + " " + miles + "mi";
    }
}
