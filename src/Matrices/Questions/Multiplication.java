package Matrices.Questions;

import java.util.Arrays;

public class Multiplication {

    public int[][] multiply(int[][] arr1, int[][] arr2) {
        int[][] c = new int[arr1.length][arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    c[i][j] = c[i][j] + arr1[i][k] * arr2[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
        return c;
    }

    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int b[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        System.out.println(a.length);
        Arrays.deepToString(m.multiply(a, b));


    }
}
