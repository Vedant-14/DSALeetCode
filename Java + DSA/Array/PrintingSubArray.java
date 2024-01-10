package Array;
import java.util.ArrayList;
import java.util.Arrays;
public class PrintingSubArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printSubArray(arr);
    }
    static void printSubArray(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            ArrayList<Integer> subarray = new ArrayList<Integer>();
            for (int j = i;j<arr.length;j++) {
                subarray.add(arr[j]);
               
                System.out.println(Arrays.toString((subarray.toArray())));
            }  
        }
    }
}
