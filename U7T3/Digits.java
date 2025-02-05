package U7T3;
import java.util.ArrayList;

public class Digits
{
  /** The list of digits from the number used to construct this object.
    * The digits appear in the list in the same order in which they appear
    * in the original number.
    */
  private ArrayList<Integer> digitList = new ArrayList<Integer> (0);
  
  /** Constructs a Digits object that represents num.
    * Precondition: num >= 0
    */
  public Digits(int num){
    if (num == 0) {
      digitList.add(0);
    }
    while (num > 0) {
      int c = num % 10;
      digitList.add(0, c);
      num -= c;
      num /= 10;
    }

  }

  public ArrayList<Integer> getDigitList () {
    return digitList;
  }

  /** Returns true if the digits in this Digits object are in strictly
    * increasing order; false otherwise.
    */
  public boolean isStrictlyIncreasing(){
    for (int c = 1; c < digitList.size(); c++){
      if (digitList.get(c) <= digitList.get(c - 1)) {
        return false;
      }
    }
    return true;
  }
}
