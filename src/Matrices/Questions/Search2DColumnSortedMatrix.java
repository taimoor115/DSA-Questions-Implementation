package Matrices.Questions;
//https://leetcode.com/problems/search-a-2d-matrix/
public class Search2DColumnSortedMatrix {
    public void search(int[][] matrix, int n, int key) {
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == key) {
                System.out.print("Value found at (" + i + ", " + j + ")");
                return;
            }
            if (matrix[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Value not Found");
    }

    public static void main(String[] args) {
        Search2DColumnSortedMatrix s = new Search2DColumnSortedMatrix();
        int[][] matrix = {

                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 51}

        };
        s.search(matrix, matrix.length, 32);
    }
}
