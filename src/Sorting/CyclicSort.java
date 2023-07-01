package Sorting;

import java.util.Arrays;

public class CyclicSort {

    //    Introduction
//    if range is 0 to N then correct is arr[i]
//    if range is 1 to N then correct is arr[i] - 1
//    {3,4,1,5,2}
//    {1,4,3,5,2}
//    {1,5,3,4,2}
//    {1,2,3,4,5}
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}