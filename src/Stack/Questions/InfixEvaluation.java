package Stack.Questions;
//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/infix-evaluation-official/ojquestion

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) throws IOException {
        InfixEvaluation i = new InfixEvaluation();
        String s = "(2 + 2)";
        i.infixEvaluation();
    }

    public static int precedence(char operator) {
        if (operator == '+') {
            return 1;
        } else if (operator == '-') {
            return 1;
        } else if (operator == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static int operations(int val1, int val2, char operator) {
        if (operator == '+') {
            return val1 + val2;
        } else if (operator == '-') {
            return val1 - val2;
        } else if (operator == '*') {
            return val1 * val2;
        } else {
            return val1 / val2;
        }
    }

    public void infixEvaluation() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String exp = br.readLine();
        Stack<Character> operatorStack = new Stack<>();
        Stack<Integer> operandStack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                operatorStack.push(ch);
            } else if (Character.isDigit(ch)) {
                operandStack.push(ch - '0');
            } else if (ch == ')') {
                while (operatorStack.peek() == '(') {
                    char operator = operatorStack.pop();
                    int val2 = operandStack.pop();
                    int val1 = operandStack.pop();

                    int res = operations(val1, val2, operator);
                    operandStack.push(res);
                }
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operatorStack.size() == 0 && operatorStack.peek() == '('
                        && precedence(ch) <= precedence(operatorStack.peek())) {
                    char operator = operatorStack.pop();
                    int val2 = operandStack.pop();
                    int val1 = operandStack.pop();

                    int res = operations(val1, val2, operator);
                    operandStack.push(res);
                }
                operatorStack.push(ch);
            }
        }
        while (operatorStack.size() == 0) {
            char operator = operatorStack.pop();
            int val2 = operandStack.pop();
            int val1 = operandStack.pop();

            int res = operations(val1, val2, operator);
            operandStack.push(res);
        }
        System.out.println(operandStack.peek());
    }
}
