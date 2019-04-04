package com.tasks.ex2_3;

public class Main {
    public static void main(String[] args)
    {
        int n = 20;
        int[] arr = {-1, -27, 33, 28, -84, -74, -94, -37, -62, 27, -36, 61, -95, 54, 95, -4, 39, -9, 13, -76,};
        System.out.println("\nint array");
        displayVect(arr);
        //    Sort.bubbleSort(arr,n);
        //    Sort.insertionSort(arr, n);
        Sort.quickSort(arr,0,n-1);
        System.out.println("\nsorted int array");
        displayVect(arr);
        System.out.println("\nBinary search x = 33, Index: " + BinarySearch.binarySearch(arr, 0, n-1, 33));
    }

    public static void displayVect(int[] arr)
    {
        for (int item : arr)
            System.out.print(item + "\t");
    }
}
