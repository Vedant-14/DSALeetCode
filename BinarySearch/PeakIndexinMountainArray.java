package BinarySearch;

public class PeakIndexinMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int ans = findPeakIndex(arr);
        System.out.println(ans);
    }
    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start!=end) {
            int mid = start + (end - start)/2;

            if(arr[mid]>arr[mid+1]) {
                end = mid;
            }
            else if(arr[mid]<arr[mid+1]) {
                start = mid +1;
            }
        }
        return start;
    }

}
