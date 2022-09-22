package algoprac;

import java.util.ArrayList;
import java.util.List;

public class Palindrone {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        List<Integer> digits = new ArrayList<>();

        //From x generate an array of digits
        for (int digit = 0; digit < 10; digit++) {
            if (x < Math.pow(10, digit)) {
                break;
            }
            digits.add(0, getDigit(digit, x));
        }
        String forwards = "";
        for (int i : digits) {
            forwards += i;

        }
        String backwards = "";
        for (int j = digits.size() - 1; j >= 0; j--) {
            backwards += digits.get(j);
        }
        if (forwards.equals(backwards)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Palindrone helper = new Palindrone();
    }

    /**
     * digit: a number 0 - 9
     */
    public int getDigit(int digit, int number) {
        int numerator = (int) (number % Math.pow(10, digit + 1));
        int denominator = (int) (Math.pow(10, digit));
        return (int) (numerator / denominator);
    }
}
