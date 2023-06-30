package Seaching;

public class SearchInRange {
    public int searchInRange(int[] arr, int start, int end, int target) {
        if ((start < 0 || start > arr.length) || (end < 0 || end > arr.length)) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchInRange s = new SearchInRange();
        int[] arr = {1, 2, 3, 4, 5, 66, 7, 8, 5, 9, 0};
        System.out.println(s.searchInRange(arr, 0, 7, 66));
    }
}
