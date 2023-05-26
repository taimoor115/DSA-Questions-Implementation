package Arrays.Questions;

public class MissingNumber {
    public static int missingNumber(int[] arr) {
        int n = arr.length + 1 ;
        int sum = n * (n + 1) / 2;
        for (int i : arr) {
            sum -= i;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        missingNumber(arr);
        System.out.println(missingNumber(arr));
//        System.out.println(Arrays.toString(arr));
    }
}
