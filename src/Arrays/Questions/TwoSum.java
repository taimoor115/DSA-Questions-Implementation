package Arrays.Questions;

import java.util.Arrays;

public class TwoSum {
//    1st Solution
//    public int[] findPair(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    return new int[] {i,j};
//                }
//            }
//        }
//        //Two method to control
//
//       return new int[]{};
//
////        throw new IllegalArgumentException("No pair is available");
//    }

    public int[] findPair(int[] arr, int target) {
        Arrays.sort(arr);
        int[] result = new int[2];
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                result[0] = left;
                result[1] = right;
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
        TwoSum ts = new TwoSum();
        int[] arr = {2, 3, 3, 5};
//        System.out.println(Arrays.toString(ts.findPair(arr,0)));
        System.out.println(Arrays.toString(ts.findPair(arr, 6)));
    }
}
