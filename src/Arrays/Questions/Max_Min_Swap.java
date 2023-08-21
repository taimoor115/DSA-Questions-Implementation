package Arrays.Questions;

import java.util.Arrays;

public class Max_Min_Swap {
    public int[] swap(int[] arr) {
        Arrays.sort(arr);
        swapArr(arr);
        return arr;
    }

    void swapArr(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        Max_Min_Swap s = new Max_Min_Swap();
        int[] arr = {4, 3, 2, 1, 5};
        System.out.println(Arrays.toString(s.swap(arr)));
    }
}
