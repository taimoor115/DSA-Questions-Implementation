package SortingAlgo.Questions;

import java.util.Arrays;

public class RearrangeSortedArrayInMax_Min {
    //      Logic
//      1. {1,2,3,4}  minIndex = 0, maxIndex = 3,  max = 5
//      2. {21,2,3,4} => 1 + (4 % 5) * 5 => 21 minIndex = 0, maxIndex = 2,  max = 5
//      3. {21,7,3,4} => 2 + (21 % 5) * 5 => 2 +(1) * 5 => 7  minIndex = 1, maxIndex = 2,  max = 5
//      4. {21,7,18,4} => 3 + (3 % 5) * 5 => => 18  minIndex = 1, maxIndex = 1,  max = 5
//      5. {21,7,18,14} => 4 + (7 % 5) * 5 => => 14  minIndex = 1, maxIndex = 1,  max = 5
    public int[] arrangeMaxMin(int[] arr) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int max = arr[maxIndex] + 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + (arr[maxIndex] % max) * max;
                maxIndex--;
            } else {
                arr[i] = arr[i] + (arr[minIndex] % max) * max;
                minIndex++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / max;
        }
        return arr;
    }

    public static void main(String[] args) {
        RearrangeSortedArrayInMax_Min r = new RearrangeSortedArrayInMax_Min();
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(r.arrangeMaxMin(arr)));
    }

}
