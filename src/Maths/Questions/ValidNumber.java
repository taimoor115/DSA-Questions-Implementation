package Maths.Questions;
//https://leetcode.com/problems/valid-number/description/
//65
public class ValidNumber {
    public boolean isNumber(String s) {
        s = s.toLowerCase().trim();
        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        for (int i = 0; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                numberSeen = true;
            } else if (s.charAt(i) == '.') {
                if (eSeen || pointSeen) {
                    return false;
                }
                pointSeen = true;
            } else if (s.charAt(i) == 'e') {
                if (eSeen || !numberSeen) {
                    return false;
                }
                numberSeen = false;
                eSeen = true;
            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return numberSeen;
    }

    public static void main(String[] args) {
        ValidNumber v = new ValidNumber();
        String s = "0e";
        System.out.println(v.isNumber(s));
    }
}