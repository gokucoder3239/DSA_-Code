class Solution {
    public int climbStairs(int n) {
        return sol(n);
    }
    public int sol(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        int ways=sol(n-1)+sol(n-2);
        return ways;
    }
}