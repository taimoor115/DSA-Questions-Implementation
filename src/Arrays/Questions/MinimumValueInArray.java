package Arrays.Questions;

public class MinimumValueInArray {

    public static int minimumValue(int[] arr) {
        int min = arr[0];
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 5, 6, 12, 1};
        printArr(arr);
        System.out.println(minimumValue(arr));
    }

}
