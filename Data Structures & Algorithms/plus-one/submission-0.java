class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry=1;
        for(int i=len-1;i>=0;i--)
        {
            int n = digits[i];
            if(carry ==1)
            {
                if( n+1 == 10)
                {
                    digits[i] =0;
                    carry =1;
                }
                else if( n+1 <10)
                {
                    digits[i] =n+1;
                    carry=0;
                }
            }
        }
        if(carry ==1)
        {
            int[] result = new int[len+1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
