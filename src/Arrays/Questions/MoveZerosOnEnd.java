package Arrays.Questions;

import java.util.Arrays;

public class MoveZerosOnEnd {
    //Two pointer Technique
//    public static void moveZeros(int[] arr) {
//        int j = 0;// focus on the zeros present in the array
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0 && arr[j] == 0) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//            if (arr[j] != 0) {
//                j++;
//            }
//        }
//    }

    public static void moveZeroes(int[] nums) {
        int a = 0;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[a];
                nums[a] = temp;
                a++;
            }
        }
    }
    public static void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0};
        printArr(arr);
        moveZeroes(arr);
        printArr(arr);
    }
}
