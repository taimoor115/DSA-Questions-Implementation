package Arrays.Questions;

public class MissingNumber {
//    public static int missingNumber(int[] arr) {
//        int n = arr.length + 1 ;
//        int sum = n * (n + 1) / 2;
//        for (int i : arr) {
//            sum -= i;
//        }
//        return sum;
//
//    }


    public static int missingNumber(int[] arr) {
        int max = max(arr);
        sort(arr);
        int i = arr.length - 1;
        while (i >= 0) {
            if (arr[i] == max) {
                i--;
                max--;
            } else {
                return max;
            }
        }
        return -1;
    }

    public static int[] sort(int[] arr) {
        int arrSize = arr.length;

        for (int i = 0; i < arrSize - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arrSize; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        missingNumber(arr);
        System.out.println(missingNumber(arr));
//        System.out.println(Arrays.toString(arr));
    }
}
