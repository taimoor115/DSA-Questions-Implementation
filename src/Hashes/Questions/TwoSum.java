package Hashes.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {

    public int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        Map map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
            } else {
                result[1] = i;
                result[0] = (int) map.get(target - arr[i]);
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum s = new TwoSum();
        int[] arr = {1, 4, 3, 2, 5, 6};
        System.out.println(Arrays.toString(s.twoSum(arr, 6)));

    }
}
//Dry Run
//    key  | Value
//    1    | 0
//    4    | 1
//    3    | 2
//    2    | 3      Condition False target - arr[i] ==> 6 - 2 = 4 which is in the map