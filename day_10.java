/**
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
**/

// problem link: https://leetcode.com/problems/search-insert-position/

// using binary search 
class Solution {
        static public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int mid,start=0,end=len-1;
        
        while(end>=start)
        {
            mid=(start+end)/2;
            System.out.println(start+" "+mid+" "+end);
            
            if(target==nums[mid])
            {
                return mid;
            }
            if(start==mid || end==mid)
                break;
            else if(target>nums[mid])
            {
                start=mid;
            }
            else
            {
                end=mid;
            }
            
        }
        if(nums[end]<target)        
            return end+1;
        
        else if(nums[start]>target)        
            return start;
        
        else
            return end;
    }
}