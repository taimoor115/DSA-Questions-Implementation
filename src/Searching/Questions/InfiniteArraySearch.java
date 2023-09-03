package Searching.Questions;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArraySearch {
    static int ans(int[] arr, int target) {
        int low = 0;
        int high = 1;

        while (target > arr[high]) {
            int temp = high + 1;
            high = high + (high - low + 1) * 2;
            low = temp;
        }
        return binarySearch(arr, target, low, high);
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(ans(arr, 6));
    }
}
