package Maths.Questions;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int currentDigit = digits.length - 1;


        while (digits[currentDigit] == 9) {
            if (currentDigit == 0) {
                int[] newArr = new int[digits.length + 1];
                newArr[0] = 1;
                return newArr;
            }
            digits[currentDigit] = 0;
            currentDigit--;
        }
        digits[currentDigit]++;
        return digits;
    }
}
