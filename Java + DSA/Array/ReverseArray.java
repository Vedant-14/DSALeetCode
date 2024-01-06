package Array;
import java.util.Arrays;

public class ReverseArray {
    

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr,0,arr.length-1);
    }
    static void reverse(int[] arr,int start,int end) {
        for (int i = start;i<=end; i++) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;

            end--;
            
        }
        System.out.print(Arrays.toString(arr));
    
    }
}
