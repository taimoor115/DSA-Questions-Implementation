package Searching.Questions;

//https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public int searchInsert(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }


    public static void main(String[] args) {
        SearchInsertPosition s = new SearchInsertPosition();
        int[] arr = {1, 2};
        System.out.println(s.searchInsert(arr, 0));
    }
}
