package Maths.Questions;

import java.util.Scanner;

public class PrimeNumber {
    public boolean isPrime(int number) {
        if (number == 0) {
            return false;
        }
        if (number < 0) {
            number = number * -1;
        }
        if (number == 1) {
            return false;
        }

        int i = number - 1;
        while (i > 1) {
            if (number % i == 0) {
                return false;
            }
            i--;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();
        System.out.println(p.isPrime(16));
    }
}
