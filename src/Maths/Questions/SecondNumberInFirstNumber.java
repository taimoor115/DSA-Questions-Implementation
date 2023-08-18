package Maths.Questions;

public class SecondNumberInFirstNumber {
    public int frequency(int first, int second) {
        int counter = 0;
        while (first > 0) {
            int rem = first % 10;
            if (rem == second) {
                counter++;
            }
            first = first / 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        SecondNumberInFirstNumber s = new SecondNumberInFirstNumber();
        System.out.println(s.frequency(11133, 1));
    }
}
