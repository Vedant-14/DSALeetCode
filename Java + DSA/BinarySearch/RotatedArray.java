package BinarySearch;
class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(searchInRotatedArray(arr,0));
       

    }
    static  int searchInRotatedArray(int[] arr,int target) {
        int pivot = findPivot(arr);
        if(pivot==-1) {
            return binarySearch(arr,0,arr.length-1,target);
        }
         if(target==arr[pivot]) {
            return pivot;
        }  
        else if(target>arr[0]){
            return binarySearch(arr,0,pivot-1,target);
        } 
       
            return binarySearch(arr,pivot+1,arr.length-1,target);
        
        
    }
    static int binarySearch(int[] arr,int start,int end, int target) {
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target>arr[mid]) {
                start=mid+1;
            }
            else if(target<arr[mid]) {
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start)/2;
        
          if(mid<end && arr[mid]>arr[mid+1]) {
            //Then Pivot lies here 
            return mid;
            }
            if(mid>start && arr[mid]>arr[mid-1]) {
                return mid;
            } 
            if(arr[start]>arr[mid]) {
                end = mid-1;
            }  
            else {
                start = mid+1;
            }   
        }
        return -1;
        
    }
}