package Maths.Questions;
//https://leetcode.com/problems/sqrtx/
//  69
public class SquareRoot {
    public int mySqrt(int x) {
        float foo = 0.5f;
        int bar = (int) Math.pow(x, foo);
        return bar;
    }
}
