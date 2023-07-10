package Hashes.Questions;

import java.util.*;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//167
public class TwoSumII {

    public int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        Map map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
            } else {
                result[1] = i + 1;
                result[0] = (int) (map.get(target - arr[i])) + 1;
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSumII s = new TwoSumII();
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(s.twoSum(arr,3)));
    }
}
