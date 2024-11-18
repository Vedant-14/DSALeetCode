package BubbleSort;
import java.util.Arrays;
public class BubSort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,6};
        int [] ans = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] bubbleSort(int[] arr) {
    
        // {3,2,1,5,6}
        // j<4b 
        boolean swapped = false;
             for (int i = 0;i<arr.length;i++) {
                for (int j =1;j<=(arr.length-i-1);j++) {
                    if(arr[j-1]>arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        swapped = true;
                    }
                }
                if(!swapped) {
                    break;
                }
             }
                
        return arr;
    }

}
