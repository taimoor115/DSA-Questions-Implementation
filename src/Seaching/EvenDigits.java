package Seaching;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {

    public int evenDigits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public boolean even(int num) {
        int numberOfDigits = countNum(num);
        return numberOfDigits % 2 == 0;
    }

    public int countNum(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        EvenDigits e = new EvenDigits();
        int[] arr = {00, 11, 22, 3, 0};
        System.out.println(e.evenDigits(arr));
    }
}
