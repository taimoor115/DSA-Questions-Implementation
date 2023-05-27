package Stack.Questions;

import Implementations.Stack.implementation.Stack;

//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/balanced-brackets-official/ojquestion
public class BalanceBrackets {
    public boolean balanceBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (chr == '(' || chr == '{' || chr == '[') {
                stack.push(chr);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char top = (char) stack.peek();
                if (chr == ')' && top == '(' || chr == '}' && top == '{' || chr == ']' && top == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BalanceBrackets b = new BalanceBrackets();
        String s = "(){}[]{}[]{}()";
        System.out.println(b.balanceBrackets(s));

    }
}