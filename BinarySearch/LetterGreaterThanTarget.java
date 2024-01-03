package BinarySearch;

public class LetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','e'};
        char target = 'c';
        
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    } 
    static int binarySearch(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;
        if(target>arr[end]) {
            return start;
        }
        while(start<=end) {
            int mid = start + (end - start)/2;
            if(target>arr[mid]) {
                start = mid +1;
            }
            else if(target<arr[mid]) {
                end = mid-1;

            }
            else {
                return (mid+1)%arr.length;
            }
        }
        return start%arr.length ;
    }
}
