package Arrays.Questions;

public class ResizeAnArray {
    //Resize Method

    public int[] resizeArr(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    //Print Method
    public void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ResizeAnArray r = new ResizeAnArray();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length);
        r.printArr(arr);
        arr = r.resizeArr(arr, 10);
        System.out.println(arr.length);
        r.printArr(arr);
    }
}
