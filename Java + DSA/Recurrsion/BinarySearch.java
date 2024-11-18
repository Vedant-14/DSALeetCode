package Recurrsion;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
       int ans =  binarySearch(arr,7,0,arr.length-1);
       System.out.println(ans);

    }
    

    static int binarySearch(int[] arr, int target , int start, int end) {
        if(end<start) {
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target) {
            return mid; 
        }
         else if(target>arr[mid]) {
            return binarySearch(arr,target,mid+1,end);
        }
        else {
            return binarySearch(arr,target,start,mid-1);
        }
        

    }
}