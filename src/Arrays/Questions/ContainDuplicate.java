package Arrays.Questions;

import java.util.Arrays;

public class ContainDuplicate {
    public boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ContainDuplicate checkDuplicate = new ContainDuplicate();
        int [] arr = {1,23,2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(checkDuplicate.isUnique(arr));
    }
}
