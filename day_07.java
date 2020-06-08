/**
You are given coins of different denominations and a total amount of money. Write a function to compute the number of combinations that make up that amount. You may assume that you have infinite number of each kind of coin.
**/
//problem link: https://leetcode.com/problems/coin-change-2/

// dynamic programming aproach
// Time complexity O(nm)
// Space complexity O(mn)
class Solution {
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length+1][amount+1];        
        for (int i=0;i<=coins.length;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                if(i==0)
                {
                    if(j==0)
                    {
                        dp[i][j]=1;
                    }
                    else 
                    {
                        dp[i][j]=0;
                    }                
                }
                else
                {
                    
                    if(j-coins[i-1]>=0)
                        dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
                    else
                        dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[coins.length][amount];
    
    }
}

// optimised solution
//Space complexity O(n)
class Solution {
    public int change(int amount, int[] coins) {
        int dp[] = new int[amount+1];        
        dp[0]=1;
           for(int i:coins)
            {
               for(int j=i;j<=amount;j++)
               {
                   dp[j]+=dp[j-i];
               }
           }
        
        return dp[amount];
    
    }
}