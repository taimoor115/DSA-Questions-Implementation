package Queue.Questions;

//https://leetcode.com/problems/gas-station/description/
//https://practice.geeksforgeeks.org/problems/circular-tour-1587115620/1
public class CircularTour {
    int tour(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0;
        int balance = 0;
        int deficency = 0;

        for (int i = 0; i < n; i++) {
            balance += petrol[i] - distance[i];
            if (balance < 0) {
                deficency += balance;
                start = i + 1;
                balance = 0;
            }
        }

        if (balance + deficency >= 0) {
            return start;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        CircularTour c = new CircularTour();
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        System.out.println(c.tour(petrol, distance));
    }
}
