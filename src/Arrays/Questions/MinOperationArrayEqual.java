package Arrays.Questions;

//https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/description/?envType=daily-question&envId=2023-11-19
//LeetCode 1887

import java.util.Arrays;

public class MinOperationArrayEqual {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] != nums[j]) {
                    nums[i] = nums[j];
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        MinOperationArrayEqual m = new MinOperationArrayEqual();
        int[] arr = {5, 1, 3};
        System.out.println(m.reductionOperations(arr));
    }
}
