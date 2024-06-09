class Solution {
    public int reverse(int x) {

        int n = x; 
        long rem;
        long num = 0;

        while (x != 0) {
            rem = x % 10;
            num = ((num * 10) + rem);
            x = x / 10;

        }
        if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) num;
    }
}