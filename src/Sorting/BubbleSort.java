package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] arr) {
        boolean isSwapped;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int[] sortedArr = b.bubbleSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
