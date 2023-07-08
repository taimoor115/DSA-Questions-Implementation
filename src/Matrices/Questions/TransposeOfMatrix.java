package Matrices.Questions;

import java.util.Scanner;

//https://leetcode.com/problems/transpose-matrix/d
public class TransposeOfMatrix {
    public void createMatrix() {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Rows:");
        int rows = src.nextInt();
        System.out.print("Enter Columns:");
        int columns = src.nextInt();
        int[][] arr = new int[rows][columns];
//        Store Values in Matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = src.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        TransposeOfMatrix t = new TransposeOfMatrix();
        t.createMatrix();
    }
}
