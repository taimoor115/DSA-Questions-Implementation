package Searching.Questions;

public class Max_Min_In_2d_Array {

    public int maxIn2dArray(int[][] arr) {
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] > max) {
                    max = arr[row][column];
                }
            }
        }
        return max;
    }

    public int minIn2dArray(int[][] arr) {
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] < min) {
                    min = arr[row][column];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Max_Min_In_2d_Array m = new Max_Min_In_2d_Array();
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {-1, 111,},
                {99, 98, 99, 100}
        };
        System.out.println("Maximum is:" + m.maxIn2dArray(arr));
        System.out.println("Minimum is:" + m.minIn2dArray(arr));
    }
}
