package Arrays.Questions;

public class FindSecondMax {
    //Second Maximum Finding Method
    public static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        if (arr.length ==1) {
            System.out.print("There is no second max:");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {  // {13,32,14} then first run
                secondMax = arr[i];
            }
        }
        return secondMax;

    }

    //Print Array Method
    public static void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {34};
        System.out.println(secondMax(arr));
    }
}
