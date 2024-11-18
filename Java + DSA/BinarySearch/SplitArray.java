package BinarySearch;
import java.util.*;
public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(splitArray(arr,2));
    } 
    public static int splitArray(int[] nums, int k) {
        // Step 1 find the start and end index or find the range between which max sum of the subarrya lies 
        int start =0;
        int end = 0;
        for (int i = 0;i<nums.length;i++) {
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        // HERE WE GOT THE VALUES OF START AND END 
        // NOW WE CAN APPLY BINARY SEARCH
        while(start<end) {
            int mid = start + (end -start)/2;
            int sum =0;
            int pieces = 1;

            // Step 2 : LOOP TO TRAVERSE ARRAY AND MAKE SUBARRAYS WHOSE SUM LESS THAN THE MID 
            for(int num : nums) {
                if((sum + num) > mid) {
                    sum = num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }

                // WE THEN GET THE VALUE OF PIECES 
                //Step 3 : APPLY CONDITION FOR PIECES 
                if(pieces>k) {
                    start = mid +1;
                }
                else {
                    end = mid;
                }
            

        }
        return end;

    }
}  
