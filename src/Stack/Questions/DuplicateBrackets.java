package Stack.Questions;

import Implementations.Stack.implementation.Stack;

//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/duplicate-brackets-official/ojquestion
public class DuplicateBrackets {
    public boolean duplicateBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (chr == ')') {
                if (stack.peek() == '(') {
                    return true;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(chr);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DuplicateBrackets d = new DuplicateBrackets();
        String s = "()";
        System.out.println(d.duplicateBracket(s));
    }
}
