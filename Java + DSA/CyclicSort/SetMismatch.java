public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i =0;
        while(i<nums.length) {
            int correct = nums[i] -1;
            if(nums[i]!=nums[correct]) {
                swap (nums,i, correct);
            }
            else {
                i++;
            }
        }
        // Run the for loop to find the element which are not at their correct index even after sorting .
        // return Those elements those are duplicate and also return the correct element should be present at the index
        int j =0;
        i=0;
        while(i<nums.length) {
            if(nums[i]!=i+1) {
                ans[j] = nums[i];
                j++;
                ans[j] = i+1;
            
            }
        }
        return ans;
    }
    void swap(int[] nums , int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}   
