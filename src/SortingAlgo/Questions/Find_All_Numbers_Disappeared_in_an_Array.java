package SortingAlgo.Questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class Find_All_Numbers_Disappeared_in_an_Array {

    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                result.add(j + 1);
            }
        }
        return result;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Find_All_Numbers_Disappeared_in_an_Array f = new Find_All_Numbers_Disappeared_in_an_Array();
        int[] arr = {1, 2, 3, 3, 5, 6, 6, 7};
        System.out.println(f.findDisappearedNumbers(arr));
    }
}
