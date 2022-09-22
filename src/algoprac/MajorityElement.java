package algoprac;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap(nums.length / 2);
        int temp;
        int maxKey = nums[0];
        int maxVal = 1;
        for (int n : nums) {
            if (map.get(n) != null) {
                temp = map.get(n);
                map.replace(n, temp + 1);
                if (temp + 1 > maxVal) {
                    maxKey = n;
                    maxVal = temp + 1;
                }
            } else {
                map.put(n, 1);
            }
        }
        return maxKey;


    }
}

