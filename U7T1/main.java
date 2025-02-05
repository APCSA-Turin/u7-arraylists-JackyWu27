import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(25);
        nums.add(40);
        nums.add(55);
        nums.add(45);
        nums.add(20);
        int sum = 0;

        for (int c : nums) {
            sum += c;
        }
        System.out.println(sum);
        String a = "apple";
        System.err.println(a.substring(0, 1));
    }
}