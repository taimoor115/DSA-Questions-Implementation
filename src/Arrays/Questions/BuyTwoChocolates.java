package Arrays.Questions;

import java.util.Arrays;

//https://leetcode.com/problems/buy-two-chocolates/description/
public class BuyTwoChocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum = prices[0] + prices[1];
        int foo = money - sum;
        if (foo >= 0) {
            return foo;
        } else {
            return money;
        }
    }

    public static void main(String[] args) {
        BuyTwoChocolates c = new BuyTwoChocolates();
        int[] arr = {6, 5, 4, 3, 2, 1};
        System.out.println(c.buyChoco(arr, 3));
    }
}
