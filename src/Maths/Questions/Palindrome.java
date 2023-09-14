package Maths.Questions;

//https://leetcode.com/problems/palindrome-number/
//09
public class Palindrome {

//    public boolean isPalindrome(int x) {
//        String y = String.valueOf(x);
//        char[] arr = y.toCharArray();
//
//        int s = 0;
//        int e = arr.length - 1;
//
//        while (s < e) {
//            if (arr[s] != arr[e]) {
//                return false;
//            } else {
//                s++;
//                e--;
//            }
//        }
//        return true;
//    }

    public boolean isPalindrome(int x) {
        int reversed = 0;
        int number = x;
        while (x > 0) {
            int digit = x % 10;
            reversed = (reversed * 10) + digit;
            x = x / 10;
        }

        return number == reversed;
    }

    public static void main(String[] args) {
        int x = -121;
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(x));
    }
}
