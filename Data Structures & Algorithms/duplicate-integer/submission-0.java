class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);
        int n = 0;
        while(n < nums.length - 1)  {
            if (nums[n] == nums[n+1]) 
            { return true;}
            n++;
        }
        return false;
    }
}