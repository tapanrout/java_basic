package dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {12, 16, 11, 78, 112, 56};
        //int arr[] = {5,7,4,1,2,3,8};
        System.out.println(Arrays.toString(insertionSortArray(arr)));
    }

    private static int[] insertionSortArray(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp =arr[i];
            while(j>=0 && arr[j]>temp){
                System.out.println(arr[j]+","+temp);
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
