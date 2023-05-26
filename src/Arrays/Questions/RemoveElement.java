package Arrays.Questions;

import java.util.Arrays;

public class RemoveElement {
    public int[] moveZero(int [] arr) {
        int a = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[a];
                arr[a] = temp;
                a++;
            }
        }
        return arr;
    }
    public int[] removeElement(int[] arr, int target) {
        int[] nums = new int[arr.length];
        for (int i = 0; i < nums.length; i++) {
            if (arr[i] != target) {
                nums[i] = arr[i];
            }
        }
        return nums;
    }
//Leetcode solution

//    public int removeElement(int[] nums, int val) {
//        int count = 0;
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] != val){
//                nums[count] = nums[i];
//                count++;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        int[] arr = {1, 2, 3, 4, 4, 4, 5};
        int res[] = r.removeElement(arr, 4);
        System.out.println(Arrays.toString(res));
    }
}
