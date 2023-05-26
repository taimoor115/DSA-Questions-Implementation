package practice.dsa.Arrays.implementation;

import java.util.Arrays;

public class Array {
    public int[] insertStart(int[] arr, int value) {
        int [] temp = new int[arr.length + 1];
        for (int i = 0; i < temp.length-1; i++) {
            temp[i+1] = arr[i];
        }
        temp[0] = value;
        return temp;
    }
    public int [] deleteAtStart(int [] arr) {
        int [] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
    public int[] insertEnd(int[] arr, int value) {
        int [] temp = new int[arr.length + 1];
        for (int i = 0; i < temp.length -1; i++) {
            temp[i] = arr[i];
        }
        temp[temp.length-1] = value;
        return temp;
    }
    public int[] deleteAtEnd(int[] arr) {
        int [] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
    public int [] insertAtPosition(int [] arr, int value,int position) {
        int [] temp = new int[arr.length + 1];
        for (int i = 0; i < temp.length-1; i++) {
            temp[i] = arr[i];
        }
        for (int i = temp.length - 1; i > position ; i--) {
            temp[i] = arr[i - 1];
        }
        temp[position] = value;
        return temp;
    }
    public int [] deleteAtPosition(int [] arr , int position){

//        temporary array introduced for the resultant array
        int [] temp = new int[arr.length-1];

//        to copy all elements from one array to another
        for (int i = 0; i < temp.length; i++){
            temp [i] = arr[i];
        }

//        to shift indices of the resultant array while deleting the desired element
        for (int j = position; j < temp.length; j++){
            temp [j] = arr[j+1];
        }
        return temp;
    }
    // Print Array Method
    public void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Array input
//    public void arrDemo()
//    {
//        int [] Myarr = new int[5];
//        Myarr[0] = 0;
//        Myarr[1] = 1;
//        Myarr[2] = 2;
//        Myarr[3] = 3;
//        Myarr[4] = 4;
//        printArr(Myarr);
//        System.out.println(Myarr[Myarr.length - 1]);
//    }
    //Main Method
    public static void main(String[] args) {
        Array ar = new Array();
//        arr.arrDemo();
//        arr.printArr(new int[] {1,2,3,4,5,6});
        int[] arr = {1, 2, 3, 4};
//        arr = ar.insertFirst(arr, 5);
//        System.out.println(Arrays.toString(arr));
//        arr = ar.insertEnd(arr, 3);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }
}
