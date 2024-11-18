package Recurrsion.Sorting;
import java.util.Arrays;
public class QuickSortRecurrsion {
    public static void main(String[] args) {
        int[] arr = {5,1,2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    // static void quickSort(int[] arr,int s,int e) {
    //     if(s==e) {
    //         return;
    //     }
    //     int i=s-1;
    //     int j=s;
    //     int pivot = e;
    //     while(j<pivot) {
    //         if(arr[j]<arr[pivot]) {
    //             // If its true then swap it with arr[i]
    //             int temp = arr[j];
    //             arr[j] = arr[i];
    //             arr[i] = temp;
    //             i++;
    //         }
    //         j++;
    //     }
    //     // NOw place the pivot element at the place of i    
    //     int temp = arr[pivot];
    //     arr[pivot] = arr[i];
    //     arr[i] = temp;

    //     quickSort(arr,s,i);
    //     quickSort(arr,i+1,e);
    // }

     static void quickSort(int[] arr,int low,int high) {
        if(low>=high) {
            return;
        }
        // {5,1,2,4}    {2,1,5}
        int pivot = arr[high];
        int s = low;
        int e = high;
        while(s<=e) {
            while(arr[s]<pivot) {
                s++;
            }
            while(arr[e]>pivot) {
                e--;
            }
            // BOth the start and end pointer stops where the condition voilates Now we are ready to swap the right elements 
            if(s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr,low,e);
        quickSort(arr,s,high);

    }
}






