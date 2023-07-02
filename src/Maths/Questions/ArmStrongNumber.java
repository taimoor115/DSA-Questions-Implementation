package Maths.Questions;

public class ArmStrongNumber {

//    153
//    1^3 = 1, 5^3 = 125, 3^3 = 27
//    1+125+27 = 153

    public boolean isArmStrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + (rem * rem * rem);
        }
        if (original == sum) {
            return true;
        } else {
            return false;
        }
    }

    public void allArmStrongNumber() {
        for (int i = 100; i < 1000; i++) {
            if (isArmStrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        ArmStrongNumber a = new ArmStrongNumber();
        System.out.println(a.isArmStrong(153));
        a.allArmStrongNumber();
    }
}
