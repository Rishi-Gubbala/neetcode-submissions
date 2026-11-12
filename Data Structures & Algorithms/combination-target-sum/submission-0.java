class Solution {
    static void backtrack(int index,int target,int sum,int[] nums ,List<Integer> subset,List<List<Integer>> result)
    {
        if(sum==target)
        {
            result.add(new ArrayList<>(subset));
        }
        if(sum>target)
        {
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            subset.add(nums[i]);
            sum+=nums[i];
            backtrack(i,target,sum,nums,subset,result);
            sum-=subset.get(subset.size()-1);
            subset.remove(subset.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            List<Integer> subset = new ArrayList<>();
            subset.add(nums[i]);
            int sum=nums[i];
            backtrack(i,target,sum,nums,subset,result);
        }
        return result;
    }
}
