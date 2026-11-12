class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.size();i++)
        {
            sb.append(strs.get(i));
            sb.append("😉");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>(Arrays.asList(str.split("😉",-1)));
        result.remove(result.size()-1);
        return result;
    }
}
