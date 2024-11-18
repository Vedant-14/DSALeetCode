package Recurrsion;
import java.util.Arrays;
public class SelectionSortRecurrsion {
   public static void main(String[] args) {
        int[] arr = {4,3,6,1,2,0};
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
   }  
   static void selectionSort(int[] arr,int row, int col,int largest) {
    if(row==0) {
        return;
    }
    if(col==0) { 
        largest = col;
        selectionSort(arr,row,col+1,largest);
    }
    else if(col<row) {
        if(arr[col]>arr[largest]) {
            largest = col;
            selectionSort(arr,row,col+1,largest);
        }
        else {
            selectionSort(arr, row, col+1, largest);
        }
    }
    else {
        int temp = arr[row-1];
        arr[row-1] = arr[largest];
        arr[largest] = temp;
        selectionSort(arr,row-1,0,0);
    }
   }
}
