package SortingAlgos.RadixSort;

import java.util.Arrays;

public class RadixSort {
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int temp = max;
        int count = 0;
        while(temp!=0) {
            int rem = temp%10;
            temp = temp/10;
            count++;
        }
    }
    
    // public static int findMax(int[] arr) {
    //     int max = arr[0];
    //     for(int i=1;i<arr.length;i++) {
    //         if(arr[i]>max) {
    //             max = arr[i];
    //         }
    //     }
    //     return max;
    // }
    public static void main(String[] args) {

    }
}
