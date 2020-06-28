/**
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

**/

// problem link : https://leetcode.com/problems/perfect-squares/



// Legrendre's 3-square theorem (https://en.wikipedia.org/wiki/Legendre%27s_three-square_theorem)
//Time complexity O(n)
class Solution {
    public int numSquares(int n) {
        if(Math.ceil(Math.sqrt(n))==Math.floor(Math.sqrt(n)))
            return 1;
        
        while(n%4==0)
        {
            n/=4;
        }
        if(n%8==7)
            return 4;
        
        for(int i=1;i*i<=n;++i)
        {
            int b=(int)Math.sqrt(n-i*i);
            if(b*b==(n-i*i))
                return 2;
        }
        
        return 3;
    }
}

// DP
// Time complexity O(n√n)
class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;++i)
        {
            dp[i]=i;
            if(i>3)
                for(int j=1;j*j<=i;++j)
                {
                    int s=j*j;
                    dp[i]=Math.min(dp[i],1+dp[i-s]);
                }
                    
        }
        return dp[n];
    }
}
