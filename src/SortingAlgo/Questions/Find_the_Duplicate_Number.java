package SortingAlgo.Questions;

public class Find_the_Duplicate_Number {
    public int findDuplicate(int[] arr) {
        // Implement Cyclic Sort (1...N)
        // Sort the array
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // {1,2,3,4,2}
        // Reapeating number at the end
        // When ever meet index + 1 != i
        // Simple return the index value
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return arr.length;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Find_the_Duplicate_Number f = new Find_the_Duplicate_Number();
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(f.findDuplicate(arr));
    }
}
