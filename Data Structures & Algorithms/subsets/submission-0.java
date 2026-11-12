class Solution {
    public static void backtrack(int[] nums, int index , List<List<Integer>> result , List<Integer> subset)
    {
        if(index==nums.length)
        {
            result.add(new ArrayList<>(subset));
            return;
        }
            subset.add(nums[index]);
            backtrack(nums,index+1,result,subset);
            subset.remove(subset.size()-1);
            backtrack(nums,index+1,result,subset);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,0,result,new ArrayList<>());
        return result;
    }
}
