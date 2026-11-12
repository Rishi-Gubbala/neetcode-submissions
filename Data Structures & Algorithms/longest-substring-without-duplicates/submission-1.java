class Solution {
    public int lengthOfLongestSubstring(String s) {
    if(s.length()==0) return 0;
    int max =0;
    HashSet<Character> set = new HashSet<>();
    int left =0;
    int right = left+1;
    set.add(s.charAt(0));
    for(int i=right;i<s.length();i++)
    {
        char c=s.charAt(i);
        while(!set.add(c))
        {
            set.remove(s.charAt(left));
            left++;
        }
        max=Math.max(max,set.size());
    }
    return Math.max(max,set.size());
    }
}
