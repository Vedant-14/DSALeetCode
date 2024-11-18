package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        // 1,2,3,4,5
        int[] arr = {15,18,2,3,6,12};
        System.out.println(rotationCount(arr));
    }
    static int rotationCount(int[] arr) {
        int pivot = findPivot(arr);
        
        return pivot+1;
    }
    static int findPivot(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end -start)/2;
            // Condition 1 pivot element is greater than its next element 
            if( mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            //Condition 2 Next element of pivot element is lesser than pivot element 
            if(mid > start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            // Condition 3 If start element is greater than mid element then the pivot lies in the left ascending array ex {4,5,1,2,3} here mid element is "1" and start element is "4".
            if(arr[start]>arr[mid] ) {
                end = mid -1;
            }
            // Condition 4 If start element is smaller than the mid element then the pivot lies in the right ascending array ex {3,4,5,1,2} here mid element is "5" and start element is "3".
            else {
                start = mid +1;
            }

        }
        return -1;
    }
}
