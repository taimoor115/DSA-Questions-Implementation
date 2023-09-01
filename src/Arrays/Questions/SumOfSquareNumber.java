package Arrays.Questions;
//https://leetcode.com/problems/sum-of-square-numbers/description/

public class SumOfSquareNumber {
    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c);

        while (a <= b) {
            if (((a * a) + (b * b)) == c) {
                return true;
            } else if (((a * a) + (b * b)) < c) {
                a++;
            } else {
                b--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SumOfSquareNumber s = new SumOfSquareNumber();
        System.out.println(s.judgeSquareSum(4));
    }
}
