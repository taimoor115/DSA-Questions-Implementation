package Arrays.Questions;

public class CheckEvenOddUsingArray {
    public String check(int n) {
        String[] arr = {"Even", "Odd"};
        return arr[n % 2];
    }

    public static void main(String[] args) {
        CheckEvenOddUsingArray c = new CheckEvenOddUsingArray();
        System.out.println(c.check(6));
    }
}
