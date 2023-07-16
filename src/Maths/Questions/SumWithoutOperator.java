package Maths.Questions;

public class SumWithoutOperator {
    public int sum(int num1, int num2) {

        int sum = num1;

        if (num2 > 0) {
            for (int i = 0; i < num2; i++) {
                sum++;
            }
        } else {
            for (int i = 0; i > num2; i--) {
                sum--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumWithoutOperator s = new SumWithoutOperator();
        System.out.println(s.sum(2, -9));
    }
}
