import java.util.*;

public class GoogleFindAllMissing {
    public static void main(String[] args) {
        int[] nums = { 1,1};
        List<Integer> ans = findDuplicates(nums);
        System.out.println(ans.toString());

    }

    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
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
        // position +1 will be the element missing in the array

        i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
                ans.add(i+1);
            }
            i++;
        }

        return ans;
    }

     static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}   