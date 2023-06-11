package Maths.Questions;

import java.util.Scanner;

public class LargerAmong3Variables {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.print("Enter first value:");
        int a = src.nextInt();
        System.out.print("Enter Second value:");
        int b = src.nextInt();
        System.out.print("Enter Third value:");
        int c = src.nextInt();
        if (a > b && a > c) {
            System.out.println("First is greater");
        } else if(b > c){
            System.out.println("Second is greater");
        } else {
            System.out.println("Third is greater");
        }

    }
}
