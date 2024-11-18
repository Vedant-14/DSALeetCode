package Recurrsion.Sorting;
import java.util.Arrays;
public class MergeSortRecurrsion {
    public static void main(String[] args) {
        int[] arr = {4,2,3,63,2};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
        // System.out.println(3/2);
    } 
    static int[] mergeSort(int[] arr) {
        if(arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;
        // int mid = start + (end - start)/2;
        // int mid = (start+end)/2;
        // int[] left = mergeSort(arr,start,mid-1);
        // int[] right = mergeSort(arr,mid,end);
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // We need an loop to traverse both left and right arrays
        // Lets take an while loop until any of one of the array is not empty 

        int sortedArray[] = new int[left.length+right.length];
        int i =0;
        int j=0;
        int y=0;
        while(i<left.length && j<right.length) {
            if(left[i]<=right[j]) {
                sortedArray[y] = left[i]; 
                i++;
            }
            else {
                sortedArray[y] = right[j];
                j++;
            }
            y++;
        }
        while(i<left.length) {
            sortedArray[y] = left[i];
            y++;
            i++;
        }
        while(j<right.length) {
            sortedArray[y] = right[j];
            y++;
            j++;
        }
        return sortedArray;

    }
}
