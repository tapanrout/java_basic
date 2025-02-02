package dsa.search;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 5, 8, 43, 3, 6, 8};
        int target =6;
        //System.out.println(findUsingLinearSearch(arr, target));
        int arr1[] = new int[]{1, 2, 5, 8, 12, 23, 36,5,6, 38,5,7,40,43};
        int target1 =5;
        System.out.println(findIndexUsingLinearSearch(arr1, target1,3));
    }

    private static int findUsingLinearSearch(int[] arr, int target) {
        int c =1;

        for(int i =0;i<arr.length;i++){
          //  System.out.println("loop:"+ c++);
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    private static int findIndexUsingLinearSearch(int[] arr, int target, int targetIndex) {
        int c =1;
        int count =0;
        for(int i =0;i<arr.length;i++){
          //  System.out.println("loop:"+ c++);
            if(arr[i]==target){
                System.out.println(count++);
                if(targetIndex == count){
                    return i;
                }

            }
        }
        return -1;
    }


}

