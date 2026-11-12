class Solution {
    public int length(int num,HashSet<Integer> set)
    {
        int count=1;
        while(set.contains(num+1))
        {
            count++;
            num++;
        }
        return count;
    }
    public int longestConsecutive(int[] nums) {
        int max=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int n:set)
        {
            if(!set.contains(n-1))
            {
                max=Math.max(length(n,set),max);
            }
        }
        return max;
    }
}
