package dsa.search;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,1,1,2,2,3};
        int target =2;
        System.out.println(findUsingBinarySearch(arr, target));
    }

    private static int findUsingBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;
        int i =1;
        int result = -1;

        while (left <= right){
            System.out.println("loop:"+ i++);
            int mid = (left+right)/2;
            if(arr[mid] == target){
                result = mid; // Store the result
                right = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                left = mid+1;
            }else {
                right =mid-1;
            }
        }
        return result;
    }
}
