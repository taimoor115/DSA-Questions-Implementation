package SortingAlgo.Questions;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/description/
//645
public class Set_Mismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[]{arr[j], arr[j] + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Set_Mismatch s = new Set_Mismatch();
        int[] arr = {2, 2, 1, 4};
        System.out.println(Arrays.toString(s.findErrorNums(arr)));
    }
}
