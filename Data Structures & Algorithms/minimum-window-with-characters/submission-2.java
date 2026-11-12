class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length() || t=="") return "";
        HashMap<Character,Integer> mapt = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            mapt.put(t.charAt(i),mapt.getOrDefault(t.charAt(i),0)+1);
        }
        int have=0;
        int need=mapt.size();
        int l=0;
        int[] res = new int[2];
        int minLen = Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++)
        {
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if(mapt.containsKey(c) && window.get(c).equals(mapt.get(c)))
            {
                have++;
            }
            while(have == need)
            {
                if((r-l+1)<minLen)
                {
                    res[0]=l;
                    res[1]=r;
                    minLen =r-l+1;
                }
                char left = s.charAt(l);
                window.put(left,window.get(left)-1);
                if(mapt.containsKey(left) && window.get(left)<mapt.get(left))
                {
                    have--;
                }
                l++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
    }
}
