package Sorting;

import java.util.Arrays;

public class SelectionSort {
//    Selection Sort Introduction

//    1. First find the minimum value in Array
//    2. Then swap it i index
    public int[] selectionSort(int[] arr) {
        int arrSize = arr.length;

        for (int i = 0; i < arrSize - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arrSize; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(s.selectionSort(arr)));
    }
}
// Algorithm Dry Run

// 1. {4,3,2,1} min = 0; unsorted part {4,3,2,1} sorted{}
//    After traversing min = arr[3]
// 2. {1,4,3,2} min = 1  sorted{1} unsorted{4,3,2}
//    After traversing min = arr[3]
// 3. {1,2,4,3} min = 2 sorted{1,2} unsorted{4,3}
//    //    After traversing min = arr[3]
// 4. {1,2,3,4} min = 3 sorted{1,2,3} unsorted{4}
//    After traversing min = arr[3]
// 5. {1,2,3,4} min = 4 sorted{1,2,3,4} condition false because i become greater than arr.length-1