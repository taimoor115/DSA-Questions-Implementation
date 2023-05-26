package Stack.Questions;

import java.util.Stack;

public class ReverseString {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char c :
                chars) {
            stack.push(c);
        }
        for (int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "TAIMOOR";
        System.out.print("Before Reversal of String:"+str);
        System.out.println("\nAfter the reversal of String:"+ReverseString.reverse(str));
    }
}
