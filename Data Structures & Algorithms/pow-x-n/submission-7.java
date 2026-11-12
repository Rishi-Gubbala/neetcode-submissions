class Solution {
    public double myPow(double x, int n) {
        long exp = Math.abs((long) n);   // long so MIN_VALUE doesn't overflow
        double result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) result *= x;
            x *= x;
            exp >>= 1;
        }
        return n < 0 ? 1 / result : result;
    }
}