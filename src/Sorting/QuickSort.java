package Sorting;

import java.util.Arrays;

public class QuickSort {
// Introduction to Quick Sort
//    In Quick Sort we follow 3 steps
//    1. Select The pivot point(start, random, end)
//    2. Partitioning(less or equal value element on left of pivot while greater is on right side)
//    3. Recursively do again until we meet the sorted array

//    How partitioning occur?
//    i = 0, j = 0, high = arr.length - 1;
//    low to j - 1 range for equal and low element
//    j to i - 1 range for greater value than pivot
//    i to high range for traversal complete array
//    {5,2,4,12,-1,3}  i = 0, j = 0 |// 3 is pivot this is the array
//    {5,2,4,12,-1,3}  i = 1, j = 0
//    {2,5,4,12,-1,3}  i = 2, j = 1
//    {2,5,4,12,-1,3}  i = 3, j = 1
//    {2,5,4,12,-1,3}  i = 4, j = 1
//    {2,-1,4,12,5,3}  i = 5, j = 2
//    {2,-1,3,12,5,4}  i = 6, j = 3 // condition false...

//    Recursive Steps
//    {2,-1,3,12,5,4}
//    {2,-1,3,12,5,4}
//    {-1,2,3,12,5,4}
//    {-1,2,3,4,5,12}

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = low;

        while (i <= high) {
            if (arr[i] <= pivot) {
//                swap(i, j)
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }

    public int[] sort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        }
        return arr;
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int[] arr = {5, 2, 4, 12, -1, 3,-1};
        System.out.println(Arrays.toString(q.sort(arr, 0, arr.length - 1)));
    }
}
