/**
Given a string s and a string t, check if s is subsequence of t.

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).
**/

// problem link: https://leetcode.com/problems/is-subsequence/

class Solution {
    public static boolean isSubsequence(String s, String t) {
        int n=s.length();
        int pos=-1;
        for(int i=0;i<n;i++)
        {
            int k=t.indexOf(s.charAt(i),pos+1);            
            if(k>pos) 
            {
                pos=k;
            }
            else
                return false;
        }
        return true;
        
    }
}