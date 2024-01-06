package BinarySearch;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] ar = {8,6,5,4,3,2};
        // System.out.println(binarysearch(arr, 2));
        System.out.println(binarysearch(ar, 8));
    }
    static int binarysearch(int[] arr , int target) {
        int start = 0;
        int end = arr.length -1;
        if(arr[start] <arr[end]) {
            while(start<=end) {
            int mid = start + (end - start)/2;

            if(arr[mid]==target) {
                return mid;
            }
            else if(target < arr[mid]) {
                end = mid -1;
            }
            else {
                start = mid+1;
            }

        } return -1;
        }
        else {
            while(start<=end) {
            int mid = start + (end - start)/2;

            if(arr[mid]==target) {
                return mid;
            }
            else if(target > arr[mid]) {
                end = mid -1;
            }
            else {
                start = mid+1;
            }

        } return -1;
        }

        
    }         
}
