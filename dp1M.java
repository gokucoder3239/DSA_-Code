class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return sol(n);
    }
    public int sol(int n)
    {
        if(n==0)
        {
            return dp[0]= 0;
        }
        if(n==1)
        {
            return dp[1]= 1;
        }
        if(n==2)
        {
            return dp[2]= 2;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }


        int ways=sol(n-1)+sol(n-2);
        dp[n]=ways;
        return ways;
    }
}