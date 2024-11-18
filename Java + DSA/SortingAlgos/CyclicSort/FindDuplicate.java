import java.util.ArrayList;
import java.util.List;

class Solution {
    // public static void main(String[] args) {
    //     int[] nums = { 1,1,2 };
    //     // List<Integer> ans = missingValues(nums);
    //     int ans = findDuplicate(nums);
    //     System.out.println("Duplicate Elements are : "+ ans.toString());

    // }

    public int findDuplicate(int[] nums) {
        // List<Integer> ans = new ArrayList<Integer>();
        int ans = 0;
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; /// As the range is given from [1 to N]
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        // Now run an loop to check which elements are at not correct postion so that
        // position +1 will be the element missing in the numsay

        i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                ans = nums[i];
            }
            i++;
        }

        return ans;
    }

     void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
