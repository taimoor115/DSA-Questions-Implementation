package Searching.Questions;

//https://leetcode.com/problems/richest-customer-wealth/description/
//1672
public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;

            for (int j = 0; j < arr[i].length; j++) {
                temp = temp + arr[i][j];
            }
            if (temp > sum) {
                sum = temp;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Richest_Customer_Wealth r = new Richest_Customer_Wealth();
        int[][] arr = {
                {1, 2, 2},
                {1, 2, 3},
                {1, 2, 4}
        };
        System.out.println(r.maximumWealth(arr));
    }
}
