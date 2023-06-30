package Seaching;

public class SearchInString {
    public boolean searchInString(String s, char target) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchInString s = new SearchInString();
        String string = "Taimoor";
        System.out.println(s.searchInString(string,'T'));
    }
}
