class Solution {
    public static int dp(int n,int[] a)
    {
        if(n<=2)
        {
            return n;
        }
        if(a[n]==0)
        {
            a[n]=dp(n-1,a) + dp(n-2,a);
            return dp(n-1,a) + dp(n-2,a);
        }
        return a[n];
    }
    public int climbStairs(int n) {
        int[] a = new int[n+1];
        return dp(n,a);
    }
}
