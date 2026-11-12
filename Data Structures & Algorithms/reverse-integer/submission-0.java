class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;   // Java keeps the sign, so negatives work too
            x /= 10;

            // Would rev * 10 + digit exceed Integer.MAX_VALUE (2147483647)?
            if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;

            // Would it go below Integer.MIN_VALUE (-2147483648)?
            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
        }
        return rev;
    }
}