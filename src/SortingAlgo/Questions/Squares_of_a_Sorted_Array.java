package SortingAlgo.Questions;
//https://leetcode.com/problems/squares-of-a-sorted-array/
//977

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {

//    Dry Run
//    1. {-4,-1,0,3,10} start = 0, end = 4 result {0,0,0,0,0} i = 4
//    2. 4 > 10 false  result {0,0,0,0,100} start = 0, end = 3, i = 3
//    3. 4 > 3 true  result {0,0,0,16,100} start = 1, end = 3, i = 2
//    4. 1 > 3 false  result {0,0,9,16,100} start = 1, end = 2, i = 1
//    5. 1 > 0 true  result {0,1,9,16,100} start = 2, end = 2, i = 0


    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int start = 0;
        int end = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(arr[start]) > Math.abs(arr[end])) {
                result[i] = arr[start] * arr[start];
                start++;
            } else {
                result[i] = arr[end] * arr[end];
                end--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Squares_of_a_Sorted_Array s = new Squares_of_a_Sorted_Array();
        int[] arr = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(s.sortedSquares(arr)));
    }
}
