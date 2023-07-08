package Queue.Questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/interesting-method-generate-binary-numbers-1-n/
public class GenerateBinaryNumber1ToN {

    public static String[] generateBinaryNumber(int n) {

        Queue<String> q = new LinkedList<>();
        String[] result = new String[n];
        q.offer("1");
        for (int i = 0; i < n; i++) {
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }

    public static void main(String[] args) {
        GenerateBinaryNumber1ToN r = new GenerateBinaryNumber1ToN();
        System.out.println(Arrays.toString(GenerateBinaryNumber1ToN.generateBinaryNumber(9)));

    }
}