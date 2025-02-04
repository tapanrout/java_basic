package dsa.sorting;

import java.util.Arrays;

import static java.util.Collections.swap;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={12, 16, 11, 78, 112, 56};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap1(arr,i,j);
            }
        }
        swap1(arr,i+1,high);
        return i+1;
    }

    private static void swap1(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
