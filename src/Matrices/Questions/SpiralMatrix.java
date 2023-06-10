package Matrices.Questions;
//https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
public class SpiralMatrix {
    public void spiralMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int l = 0;
        int k = 0;//k for rows & l for columns
        int i;      //i = iteration
        while (k < rows && l < columns) {
            //Print left to right
            for (i = l; i < columns; i++) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            //Print TopRight to bottom
            for (i = k; i < rows; i++) {
                System.out.print(matrix[i][columns - 1] + " ");
            }
            columns--;
            //Print BottomRight to left
            if (k < rows) {
                for (i = columns - 1; i >= l; i--) {
                    System.out.print(matrix[rows - 1][i] + " ");
                }
                rows--;
            }
            //BottomLeft to Top
            if (l < columns) {
                for (i = rows - 1; i >= k; i--) {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SpiralMatrix s = new SpiralMatrix();
        s.spiralMatrix(matrix);
    }
}
