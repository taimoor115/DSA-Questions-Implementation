package Searching.Questions;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//744
public class SmallestCharacterGreaterThanTarget {
    public static char nextGreatestLetter(char[] arr, char target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return arr[low % arr.length];
    }
}
