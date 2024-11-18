import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1};
         int ans = firstMissingPositive(nums);
         System.out.println(ans);
    }
    public  static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length) {
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length+1 && nums[i]!=nums[correct] ) {
                swap(nums,i,correct);
            }
            else {i++;}
        }
            i=0;
            while(i<nums.length) {
                if(nums[i]!=i+1) {
                    return i+1;
                }
                i++;
            }
            return nums.length+1;
    }
     static void swap(int[] nums,int first,int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
