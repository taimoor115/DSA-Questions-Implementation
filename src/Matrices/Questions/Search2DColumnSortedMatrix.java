package Matrices.Questions;

//https://leetcode.com/problems/search-a-2d-matrix/
public class Search2DColumnSortedMatrix {
    public boolean search(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i >= 0 && i < m && j >= 0 && j < n) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Search2DColumnSortedMatrix s = new Search2DColumnSortedMatrix();
        int[][] matrix = {
                {1, 3}
        };
        System.out.print(s.search(matrix, 3));
    }
}