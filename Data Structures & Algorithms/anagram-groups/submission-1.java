class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            int[] a = new int[26];
            for(char c:s.toCharArray())
            {
                a[c-'a']++;
            }
            String sorted = Arrays.toString(a);
            if(!map.containsKey(sorted))
            {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sorted,list);
            }
            else
            {
                map.get(sorted).add(s);
            }
        }   
        return new ArrayList<>(map.values());
    }
}
