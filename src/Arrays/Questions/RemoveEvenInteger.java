package Arrays.Questions;

public class RemoveEvenInteger {
    public int[] removeEven(int[] arr) {
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countOdd++;
            }
        }
        int[] resultArr = new int[countOdd];
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                resultArr[index] = arr[j];
                index++;
            }
        }
        return resultArr;
    }

    public void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveEvenInteger r = new RemoveEvenInteger();
        int[] arr = {1, 2, 3, 45, 6, 7, 8, 3, 4, 52, 23};
        r.printArr(arr);
        int[] result = r.removeEven(arr);
        r.printArr(result);


    }
}


