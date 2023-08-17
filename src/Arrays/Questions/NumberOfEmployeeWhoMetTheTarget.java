package Arrays.Questions;

//https://leetcode.com/problems/number-of-employees-who-met-the-target/description/
//2798
public class NumberOfEmployeeWhoMetTheTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        NumberOfEmployeeWhoMetTheTarget n = new NumberOfEmployeeWhoMetTheTarget();
        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;
        System.out.println(n.numberOfEmployeesWhoMetTarget(hours, target));
    }
}
