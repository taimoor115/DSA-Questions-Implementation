package SortingAlgo.Questions;

import java.util.Arrays;
public class MergeTwoSortedArrays {
    public int[] merge(int[] arr1, int m, int[] arr2, int n) {
        int[] result = new int[m + n];
        int i = 0; // Traversal for arr1
        int j = 0;// Traversal for arr2
        int k = 0;// Traversal for result

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
//        if arr1 is exhausted then
        while (i < m) {
            result[k] = arr1[i];
            i++;
            k++;
        }
//        if arr1 is exhausted then
        while (j < n) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//        while (j >= 0)
//            if (i >= 0 && nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
//            else nums1[k--] = nums2[j--];
//    }

    public static void main(String[] args) {
        MergeTwoSortedArrays m = new MergeTwoSortedArrays();
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        System.out.println(Arrays.toString(m.merge(arr1,4, arr2,4)));
    }
}
