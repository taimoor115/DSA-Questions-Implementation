package Arrays.Questions;

import java.util.Arrays;

public class SmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j] && i != j) {
                    counter += 1;
                }
            }
            result[i] = counter;
        }
        return result;
    }

    public static void main(String[] args) {
        SmallerThanCurrent s = new SmallerThanCurrent();
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(s.smallerNumbersThanCurrent(nums)));
    }
}

