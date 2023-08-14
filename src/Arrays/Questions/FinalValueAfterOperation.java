package Arrays.Questions;
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/


public class FinalValueAfterOperation {
    public int finalValueAfterOperations(String[] operation) {
        int counter = 0;
        for (int i = 0; i < operation.length; i++) {
            if (operation[i] == "X++" || operation[i] == "++X") {
                counter++;
            } else {
                counter--;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        FinalValueAfterOperation f = new FinalValueAfterOperation();
        String[] operation = {"--X","X++","X++"};
        System.out.print(f.finalValueAfterOperations(operation));
    }
}
