package Arrays.Questions;
//https://leetcode.com/problems/length-of-last-word/description/
//58
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        int counter = 0;
        for (int i = s.length() - 1 ; i >= 0; i--) {
                if (s.charAt(i) != ' ') {
                    counter++;
                } else {
                    if (counter > 0) {
                        return counter;
                    }
                }
        }
        return counter;
    }

    public static void main(String[] args) {
        LengthOfLastWord l = new LengthOfLastWord();
        String s = "a";
        System.out.println(l.lengthOfLastWord(s));
    }
}
