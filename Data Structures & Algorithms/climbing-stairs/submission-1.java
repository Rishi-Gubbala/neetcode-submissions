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
/*
class Solution {
    public int climbStairs(int n) {
        int one = 1, two =1;

        for (int i=0; i<n-1; i++){
            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
    }
}
*/