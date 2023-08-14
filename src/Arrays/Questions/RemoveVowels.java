package Arrays.Questions;

import java.util.ArrayList;
import java.util.List;

public class RemoveVowels {

    public List<String> removeVowels(String string) {
        ArrayList<String> s = new ArrayList<>();
        string = string.toLowerCase();
        char[] arr = string.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')) {
                s.add(String.valueOf(arr[i]));
            }
        }
        return s;
    }

    public static void main(String[] args) {
        RemoveVowels r = new RemoveVowels();
        String string = "Hey It's me TAimoor Hussain!";
        System.out.println(r.removeVowels(string));
    }
}
