package algoprac;

import java.util.HashSet;

public class HappyNumber {
    StringBuilder numAsString = new StringBuilder("");
    int[] digits;
    public HappyNumber(int num){
        numAsString.append(num);
    }
    public boolean isHappy(int n) {
        HashSet<Integer> nums= new HashSet<>();
        if(n == 0)
            return false;
        if(n == 1)
            return true;

        int sumOfSquares = getSumOfSquares(getDigits(n));
        while(sumOfSquares != 1){
            sumOfSquares = getSumOfSquares(getDigits(sumOfSquares));
            System.out.println(sumOfSquares);
            if(!nums.add(sumOfSquares)){
                return false;
            }
        }


        return true;
    }
    public int[] getDigits(int n){
        String value = ""+n;
        int[] res = new int[value.length()];
        int counter =0;
        while (n >= 10) {
            res[counter] = n % 10;
            n = n / 10;
            counter++;
        }
        res[res.length-1] = n;
        return res;
    }

    public int getSumOfSquares(int [] digits){
        int sum =0;
        for(int digit : digits){
            sum += Math.pow(digit,2);
        }
        return sum;
    }
    public int getNumFromDigits(int[] digits){
        StringBuilder numString = new StringBuilder();
        for (int digit : digits){
            numString.append(digit);
        }
        return Integer.getInteger(numString.toString());
    }

    public static void main (String args[]){
        HappyNumber x = new HappyNumber(1);
        System.out.println(x.isHappy(59));
        System.out.println(x.isHappy(1));
        System.out.println("pass");
        System.out.println(x.isHappy(2));

        System.out.println("pass");

    }
}
