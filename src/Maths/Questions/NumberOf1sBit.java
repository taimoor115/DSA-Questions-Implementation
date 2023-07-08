package Maths.Questions;
//https://leetcode.com/problems/number-of-1-bits/description/
public class NumberOf1sBit {
    public int numberOf1bit(int n) {
        int a = 1;
        int counter = 0;

        for (int i = 0; i < 32; i++) {
            if ((n & a) != 0) {
                counter++;
            }
            a <<= 1;
        }
        return counter;
    }

    public static void main(String[] args) {
        NumberOf1sBit n = new NumberOf1sBit();
        System.out.println(n.numberOf1bit(2097152));
    }
}
