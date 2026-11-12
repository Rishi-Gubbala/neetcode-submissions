class Solution {
    public int hammingWeight(int n) {
        int count=0;
        do
        {
            if((n & 1 )==1) count++;
            n=n>>1;
        }while(n>0);
        return count;
    }
}
