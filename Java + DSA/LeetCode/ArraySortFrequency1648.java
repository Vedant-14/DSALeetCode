// QUESTION SOLUTION IS STILL INCOMPLETE 
package LeetCode;
import java.util.*;
public class ArraySortFrequency1648 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2,2};
        frequencySort(arr);
     }
    public static  void frequencySort(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        frequency(nums,0,0);
        
    }
    private static void frequency(int[] arr,int count,int pointer) {  //arr,0,0,1
        if(pointer==arr.length) {
            System.out.println(count);
            return;
        }

        if(pointer==0) {
            frequency(arr,1,pointer+1);
        }
        if( pointer>0 && arr[pointer]==arr[pointer-1]) {
            frequency(arr,count+1,pointer+1);
        }
         
        else if(pointer>0) {
            System.out.println(count);
            frequency(arr,1,pointer+1);
        }
    } 
}

