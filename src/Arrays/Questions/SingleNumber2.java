package Arrays.Questions;
//https://leetcode.com/problems/single-number-ii/description/
//137
import java.util.Arrays;

public class SingleNumber2 {

    public static void main(String[] args) {
        SingleNumber2 s = new SingleNumber2();
        int[] arr = {1,1,1,0,0,0,2};
        System.out.println(s.singleNumber(arr));

    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int iterator = length / 3;
        int i = 1;
        int j = 1;
        int temp = 1;
        while (i <= iterator) {
            if (nums[j - 1] == nums[temp * 3 - 1]) {
                j = temp * 3 + 1;
            } else {
                return nums[j - 1];
            }
            i++;
            temp++;
        }
        return nums[length - 1];
    }
}
