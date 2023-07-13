package Arrays.Questions;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
//28
public class Find_the_Index_of_the_First_Occurrence_in_a_String {


    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        Find_the_Index_of_the_First_Occurrence_in_a_String f = new Find_the_Index_of_the_First_Occurrence_in_a_String();
        String heyStack = "sadbutsad";
        String needle = "sad";
        System.out.println(f.strStr(heyStack, needle));
    }
}
