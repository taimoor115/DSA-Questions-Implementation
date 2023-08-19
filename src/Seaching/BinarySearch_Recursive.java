package Seaching;

public class BinarySearch_Recursive {
    public int binarySearch(int[] arr, int low, int high, int target) {
        if (low == high) {
            if (arr[low] == target) {
                return low;
            } else {
                return 0;
            }
        } else {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
//            Recursive Case
            if (arr[mid] > target) {
                return binarySearch(arr, low, mid - 1, target);
            } else {
                return binarySearch(arr, mid + 1, high, target);
            }

        }
    }

    public static void main(String[] args) {
        BinarySearch_Recursive r = new BinarySearch_Recursive();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 6;
        System.out.println(r.binarySearch(arr, 0, arr.length, target));
    }
}
