package Arrays.Questions;

import java.util.Arrays;

public class MoveZeroOnStart {

    public int[] moveStart(int[] arr) {
        int i = arr.length - 1;
        int j = arr.length - 1;

        while (i >= 0) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            i--;
        }
        return arr;
    }
//    public int[] moveLeft(int[] arr) {
//        int i = 0;
//        int j = arr.length - 1;
//
//        while (i <= j) {
//            if (arr[i] == 0) {
//                i++;
//            } else {
//                swap(arr, i, j);
//                j--;
//            }
//        }
//        return arr;
//    }
//
//    private void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

    public static void main(String[] args) {
        MoveZeroOnStart m = new MoveZeroOnStart();
        int[] arr = {0, 2, 3, 4, 5, 0, 0, 2, 0};
        System.out.println(Arrays.toString(m.moveStart(arr)));
    }
}
