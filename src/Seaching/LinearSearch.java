package Seaching;

public class LinearSearch {

    public int linearSearch(int [] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LinearSearch l = new LinearSearch();
        int[] arr = {1,2,3,4,5,2,76};
        System.out.println("The target is on "+ l.linearSearch(arr,0)+ " index");
    }
}
