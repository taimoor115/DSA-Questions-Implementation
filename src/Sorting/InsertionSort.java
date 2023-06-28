package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        InsertionSort i = new InsertionSort();
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(i.insertionSort(arr)));
    }
}
//Working (Insertion sort has 1 sorted part and other is unsorted part)
//1. {5,4,3,2,1} => {5} is sorted part while {4,3,2,1} That's why we start traversal to 1 not 0
//2. {4,5,3,2,1} => {4,5} sorted while {3,2,1} unsorted
//3. {4,3,5,2,1}
//   {3,4,5,2,1} => {3,4,5} sorted while {2,1} unsorted
//4. {3,4,2,5,1}
//   {3,2,4,5,1}
//   {2,3,4,5,1} => {2,3,4,5} sorted while {1} unsorted
//5. {2,3,4,1,5}
//   {2,3,1,4,5}
//   {2,1,3,4,5}
//   {1,2,3,4,5} => {1,2,3,4,5} sorted part