class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lp = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                lp[i]=1;
                continue;
            }
            lp[i]=lp[i-1]*nums[i-1];
        }
        int[] rp=new int[nums.length];
        int[] result = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i==nums.length-1)
            {
                rp[i]=1;
                result[i]=lp[i];
                continue;
            }
            rp[i]=rp[i+1]*nums[i+1];
            result[i]=rp[i]*lp[i];
        }
        return result;
    }
}  
