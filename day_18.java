/**
find hindex in a sorted array
**/

// problem link: https://leetcode.com/problems/h-index-ii/description/

// binary search 
// Time complexity O(logn)
class Solution {
    public int hIndex(int[] citations) {
        int len=citations.length;
        if(len==0)
        {
            return 0;
        }
        if(len==1)
        {
            if(citations[0]==0)
            {
                return 0;
            }
            else
                return 1;
        }
        int mid;
        int start=0,end=len-1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(citations[mid]==len-mid)
                return citations[mid];
            else if(citations[mid]<=len-mid)
                start=mid+1;
            else
                end=mid-1;
        }
        return len-start;
        
    }
}