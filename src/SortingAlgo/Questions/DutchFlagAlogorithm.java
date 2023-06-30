package SortingAlgo.Questions;

import java.util.Arrays;
////https://leetcode.com/problems/sort-colors/description/
public class DutchFlagAlogorithm {

    public int[] reArrange(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, k);
                k--;
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        DutchFlagAlogorithm d = new DutchFlagAlogorithm();
        int[] arr = {1, 2, 1, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 1, 1};
        System.out.println(Arrays.toString(d.reArrange(arr)));
    }
}
