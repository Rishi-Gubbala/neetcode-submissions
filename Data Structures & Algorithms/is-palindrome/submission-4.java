class Solution {
    public boolean Palindrome(String s)
    {
        int j=s.length()-1;
        int i=0;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        char[] arr=s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c:arr)
        {
            if(Character.isLetterOrDigit(c))
            {
                if(Character.isLetter(c))
                {
                    char x=Character.toLowerCase(c);
                    sb.append(x);
                }
                else
                {
                    sb.append(c);
                }
            }
        }
        String S= sb.toString();
        return Palindrome(S);

    }
}