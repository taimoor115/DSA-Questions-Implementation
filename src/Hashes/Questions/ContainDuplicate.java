package Hashes.Questions;

import java.util.Set;
import java.util.HashSet;
//https://leetcode.com/problems/contains-duplicate/
//217
public class ContainDuplicate {

    public boolean containDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }


    public static void main(String[] args) {
        ContainDuplicate d = new ContainDuplicate();
        int[] arr = {11, 23, 4, 1, 2, 33};
        int[] arr1 = {11, 23, 4, 1, 2, 33, 1};
        System.out.println(d.containDuplicate(arr));
        System.out.println(d.containDuplicate(arr1));
    }
}
