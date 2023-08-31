package Arrays.Questions;

//https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagnalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int j = mat[0].length - 1;
        for (int i = 0; i < mat[0].length; i++) {

            sum += mat[i][i];
            if (i + i != i + j)
                sum += mat[i][j];
            j--;
        }
        return sum;
    }

    public static void main(String[] args) {
        MatrixDiagnalSum m = new MatrixDiagnalSum();
        int[][] matrix ={{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        System.out.println(m.diagonalSum(matrix));
    }

}
