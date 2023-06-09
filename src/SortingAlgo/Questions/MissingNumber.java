package SortingAlgo.Questions;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {

    public int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        MissingNumber m = new MissingNumber();
        int[] arr = {4,0,1,2,3,9};
        System.out.println(m.missingNumber(arr));
    }
}
