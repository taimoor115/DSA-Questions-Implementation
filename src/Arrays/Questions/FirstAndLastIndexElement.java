package Arrays.Questions;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//34
import java.util.Arrays;

public class FirstAndLastIndexElement {
    private int left(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private int right(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = left(arr, target);
        result[1] = right(arr, target);
        return result;
    }

    public static void main(String[] args) {
        FirstAndLastIndexElement l = new FirstAndLastIndexElement();
        int[] arr1 = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(l.searchRange(arr1, target)));
    }
}

