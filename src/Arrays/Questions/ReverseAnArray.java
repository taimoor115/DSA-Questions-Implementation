package Arrays.Questions;

public class ReverseAnArray {
    //Two Pointer Technique
//    public static void reverse(int [] numbers , int start , int end)
//    {
//        while (start < end)
//        {
//            int temp = numbers[start];
//            numbers[start] = numbers[end];
//            numbers[end] = temp;
//            start++;
//            end--;
//        }
//    }
    public static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        printArr(numbers);
//        reverse(numbers,0, numbers.length -1 );
        reverse(numbers);
        printArr(numbers);
    }
}
