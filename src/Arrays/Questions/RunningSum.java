package Arrays.Questions;
//https://leetcode.com/problems/running-sum-of-1d-array/description/
//1480
import java.util.Arrays;

public class RunningSum {
    public int[] runningSum(int[] arr) {
        int sum = 0;
        for(int i = 1; i < arr.length; i++) {
            sum = arr[i] + arr[i - 1];
            arr[i] = sum;
        }
        return arr;
    }

    public static void main(String[] args) {
        RunningSum s = new RunningSum();
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(s.runningSum(arr)));
    }
}
