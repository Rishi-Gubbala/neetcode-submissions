class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum = (l*(l+1))/2;
        int nsum=0;
        for(int i=0;i<l;i++)
        {
            nsum+=nums[i];
        }
        return sum-nsum;
    }
}
