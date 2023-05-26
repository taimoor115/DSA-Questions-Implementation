package Arrays.Questions;

import java.util.Scanner;

public class CheckStringPilindrome {
    public boolean isPilindrome(String word) {
        char[] charArr = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (charArr[start] != charArr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a Word:");
        String input = src.nextLine();
        CheckStringPilindrome cp = new CheckStringPilindrome();
        if (cp.isPilindrome(input)) {
            System.out.println("The String is Pilindrome");
        }else {
            System.out.println("The String is not Pilindrome");
        }
    }
}
