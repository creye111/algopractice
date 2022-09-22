package algoprac;

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        //case one, single item
        //case two more than one
        int[] newNums = new int[nums.length];

        if (nums.length == 1) {
            nums = nums;
        } else {
            if (k / nums.length > 1) {
                k = k % nums.length;
            }
            for (int i = 0; i < nums.length; i++) {
                int newPos = (i + k) % nums.length;
                newNums[newPos] = nums[i];

            }
            nums = newNums;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String args[]){
        int []nums = {1,2,3,4,5,6,7};
        int k =3;
        RotateArray.rotate(nums, k);
    }
}
