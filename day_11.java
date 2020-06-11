/**
Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
**/
// problem link: https://leetcode.com/problems/sort-colors/
// TimeComplexity O(kn)
// Using counting search logic
class Solution {
    public static void sortColors(int[] nums) {
        int colours[]= new int[3];
        int s=0;
        for(int i: nums)
        {
            colours[i]++;
        }
        for (int i=0;i<3;i++)
        {
            for(int j=s;j<colours[i]+s;j++)
            {
                nums[j]=i;
            }
            s+=colours[i];
        }
        
        

        
    }
}