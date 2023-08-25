package Arrays.Questions;
//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/
// 2535
public class DiffBtwElementSumAndDigitSum {
    public int differenceOfSum(int[] nums) {
        int sum = sum(nums);
        int difference = difference(nums);
        return sum - difference;
    }

    // Find Sum
    private int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private int difference(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 9) {
                sum += arr[i];
            } else {
                while (arr[i] > 0) {
                    int digit = arr[i] % 10;
                    sum += digit;
                    arr[i] /= 10;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        DiffBtwElementSumAndDigitSum d = new DiffBtwElementSumAndDigitSum();
        int[] nums = {1, 15, 6, 3};
        System.out.println(d.differenceOfSum(nums));
    }
}
