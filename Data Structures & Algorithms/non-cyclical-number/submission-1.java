class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        HashSet<Integer> set = new HashSet<>();
        while(n!=1)
        {
            if(!set.add(n))
            {
                return false;
            }
            int x=n;
            int sum=0;
            while(x>0)
            {
                sum+=Math.pow(x%10,2);
                x=x/10;
            }
            n=sum;
        }
        return true;
    }
}
