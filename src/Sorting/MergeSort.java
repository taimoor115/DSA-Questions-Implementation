package Sorting;

import java.util.Arrays;

public class MergeSort {
//      Introduction
//      {5,4,3,2,1}
//    Divide Recursively(Find Mid-part and divide the array)
//      {5,4,3}  {2,1}
//      {5,4} {3}  {2,1}
//      {5} {4} {3} {2,1}
//    Now join the first array in sort manner
//      {3,4,5} {2,1}
//      Now divide second part of array
//      {3,4,5} {2} {1}
//      {1,2,3,4,5}

    public int[] sort(int[] arr, int[] temp, int low, int high) {
        if (low < high) { //Recursive base case
            int mid = low + (high - low) / 2; // control overflow condition low + high may give a value
            // that is put of range
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
        return arr;
    }

    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
//        Copy value of arr into temp
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low; // Traverse the left sub-array
        int j = mid + 1; // Traverse the right sub-array
        int k = low; // Traverse to sort the original array

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
//        If right sub-array is exhausted then we don't put any code because
//        the values are on the correct position
//        If left sub-array is exhausted then we put some code

        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(m.sort(arr, new int[arr.length], 0, arr.length - 1)));
    }
}
