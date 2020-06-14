/**
    
User Accepted:7626
User Tried:7659
Total Accepted:7837
Total Submissions:8134
Difficulty:Easy
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
**/

// Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) {
        int ans[]=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            ans[i]+=ans[i-1]+nums[i];
        }
        return ans;
        
    }
}