package SortingAlgo.Questions;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.List;
public class Find_All_Duplicates_in_an_Array {

    public List<Integer> findDuplicates(int[] arr) {
        // Implement Cyclic Sort (1...N)
        // Sort the array
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
        // {1,2,3,4,2}
        // Reapeating number at the end
        // When ever meet index + 1 != i
        // Simple return the index value
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                result.add(arr[j]);
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
        Find_All_Duplicates_in_an_Array f = new Find_All_Duplicates_in_an_Array();
        int[] arr = {1,2,5,5,5,5,4,2,1,7,8,1};
        System.out.println(f.findDuplicates(arr));
    }
}
