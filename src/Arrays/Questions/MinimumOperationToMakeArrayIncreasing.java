package Arrays.Questions;

//https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/submissions/
//1827
public class MinimumOperationToMakeArrayIncreasing {


//  Brute Force
//    public int minOperations(int[] arr) {
//        int counter = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] <= arr[i - 1]) {
//                int iterator = arr[i - 1] - arr[i] + 1;
//
//                while (iterator > 0) {
//                    arr[i] += 1;
//                    counter++;
//                    iterator--;
//                }
//            }
//        }
//        return counter;
//    }

    public int minOperations(int[] arr) {
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                int iterator = arr[i - 1] - arr[i] + 1;
                arr[i] += iterator;
                counter += iterator;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        MinimumOperationToMakeArrayIncreasing m = new MinimumOperationToMakeArrayIncreasing();
        int[] arr = {1, 1, 1};
        System.out.println(m.minOperations(arr));
    }
}
