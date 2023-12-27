package Arrays.Questions;
import java.util.Arrays;
//https://leetcode.com/problems/single-number/
//136
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int iterator = length / 2;
        int i = 1;
        int j = 1;
        int temp = 1;
        while (i <= iterator) {
            if (nums[j - 1] == nums[temp * 2 - 1]) {
                j = temp * 2 + 1;
            } else {
                return nums[j - 1];
            }
            i++;
            temp++;
        }
        return nums[length - 1];
    }
}
