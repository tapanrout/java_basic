package dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {12, 16, 11, 78, 112, 56};
        System.out.println(Arrays.toString(selectionSortArray(arr)));
    }

    private static int[] selectionSortArray(int[] arr) {
        for(int i =0; i< arr.length; i++){
            int min =i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] < arr[j]){
                    min = j;
                }
            }
           // System.out.println(min);

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }


}
