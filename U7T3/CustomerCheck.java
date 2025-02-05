package U7T3;

import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        double t = 0;
        for (MenuItem c : check) {
            t += c.getPrice();
        }
        return t;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        for (MenuItem c : check) {
            if (c.isDailySpecial()) {
                return false;
            }
        }
        if (totalPrices() < 40) {
            return false;
        } else {
            return true;
        }
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        double f = totalPrices();
        int c = 0;
        for (MenuItem m : check) {
            if (m.isEntree()) {
                c ++;
            }
        }
        if (c > 5) {
            f += totalPrices() / 5;
        }
        if (couponApplies()) {
            f -= totalPrices() / 4;
        }
        return f;
    }
}

