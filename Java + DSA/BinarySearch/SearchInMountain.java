package BinarySearch;
class SearchInMountain {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int ans = search(arr,3);
        System.out.println(ans);
        
        
    }
    static int search(int[] arr,int target) {
        int peakvalue= peakIndex(arr);
        int start = 0;
        int end = peakvalue;
        while(start<=end) {
            int mid = start + (end -start)/2;
            if(target<arr[mid]) {
                end = mid-1;
            }
            else if(target>arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        start = peakvalue;
        end = arr.length-1;
        while(start<=end) {
            int mid = start + (end -start)/2;
            if(target<arr[mid]) {
                start = mid+1;
            }
            else if(target>arr[mid]) {
                end = mid-1;
            }
            else {
                return mid;
            }

        
        }
        return -1;

    }
    static int peakIndex(int [] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            int mid = start + (end - start)/2;
            if(arr[mid]<arr[mid+1]) {
                start = mid +1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
