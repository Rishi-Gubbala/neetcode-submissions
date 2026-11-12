class Solution {
    static void backtrack(int index,int target,int sum,int[] nums ,List<Integer> subset,List<List<Integer>> result)
    {
        if(sum==target)
        {
            result.add(new ArrayList<>(subset));
            return;
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
        List<Integer> subset = new ArrayList<>();
        backtrack(0,target,0,nums,subset,result);
        return result;
    }
}
