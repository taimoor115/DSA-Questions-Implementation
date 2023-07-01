package Searching.Questions;

import java.util.Arrays;

public class SearchIn2dArray {

    public int[] searchIn2dArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {

            for (int column = 0; column < arr[row].length; column++) {

                if (arr[row][column] == target) {
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        SearchIn2dArray s = new SearchIn2dArray();
        int[][] arr = {
                {1, 2, 3, 4,5},
                {5, 6, 7, 8},
                {99, 98, 99, 100}
        };
        int[] ans = s.searchIn2dArray(arr, 5);
        System.out.println(Arrays.toString(ans));

    }
}
