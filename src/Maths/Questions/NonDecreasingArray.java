package Maths.Questions;

public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length && count <= 1; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (i < 2 || nums[i] >= nums[i - 2]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return count <= 1;
    }


    public static void main(String[] args) {
        NonDecreasingArray d = new NonDecreasingArray();
        int[] arr = {5,7,1,8};
        System.out.println(d.checkPossibility(arr));
    }
}
