package Seaching;
public class BinarySearch {

    public int binarySearch(int[] arr, int target) {
//        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(b.binarySearch(arr,7));
    }
}
