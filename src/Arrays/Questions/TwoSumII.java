package Arrays.Questions;

import java.util.*;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//167
public class TwoSumII {

    public int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSumII s = new TwoSumII();
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(s.twoSum(arr, 5)));
    }
}
