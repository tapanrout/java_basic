package dsa.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
//    public static void main(String[] args) {
//        int arr[] = {12, 16, 11, 78, 112,1,2,3,4,5,6, 56,1,2,3};
//        //int arr[] = {5,7,4,1,2,3,8};
//        mergeSort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    private static void mergeSort(int[] arr, int left, int right) {
//        if(left < right){
//            int mid = left + (right - left)/2;
//            mergeSort(arr, left, mid);
//            mergeSort(arr, mid+1, right);
//            merge(arr, left, mid, right);
//        }
//    }
//
//    private static void merge(int[] arr, int left, int mid, int right) {
//        int n1 = mid-left+1;
//        int n2 = right - mid;
//
//        int[] leftArr = new int[n1];
//        int[] rightArr = new int[n2];
//
//        for (int i = 0; i <n1; i++) {
//            leftArr[i] = arr[left +i];
//        }
//
//        System.out.println("leftArr: "+Arrays.toString(leftArr));
//
//        for (int j = 0; j < n2; j++) {
//            rightArr[j] = arr[mid +1 +j];
//        }
//
//        System.out.println("rightArr: "+Arrays.toString(rightArr));
//
//        int i=0, j=0, k = left;
//        while (i<n1 && j <n2){
//            if(leftArr[i] <= rightArr[j]){
//                arr[k] = leftArr[i];
//                i++;
//            }else{
//                arr[k] = rightArr[j];
//                j++;
//            }
//            k++;
//        }
//
//     // Copy remaining elements of leftArray (if any)
//        while (i < n1) {
//            arr[k] = leftArr[i];
//            i++;
//            k++;
//        }
//
//        // Copy remaining elements of rightArray (if any)
//        while (j < n2) {
//            arr[k] = rightArr[j];
//            j++;
//            k++;
//        }
//    }
}
class MergeSortT1{
    public static void main(String[] args) {
        int arr[] = {12, 16, 11, 78, 112, 56};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            mergeToSort(arr,low,high,mid);
        }
    }

    private static void mergeToSort(int[] arr, int low, int high, int mid) {
        int merge[]= new int[high-low+1];
        int indx1=low;
        int indx2= mid+1;int k=0;
        while(indx1<=mid && indx2<=high){
            if(arr[indx1]<=arr[indx2]){
                merge[k++]=arr[indx1++];
            }else{
                merge[k++]=arr[indx2++];
            }
        }
        while(indx1<=mid){
                merge[k++]=arr[indx1++];
        }
        while(indx2<=high){
            merge[k++]=arr[indx2++];
        }
        for(int i=0,t=low;i<merge.length;i++,t++){
            arr[t]=merge[i];
        }
    }

}
