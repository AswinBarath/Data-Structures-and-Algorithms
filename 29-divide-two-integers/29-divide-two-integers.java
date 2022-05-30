class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 1 << 31 && divisor == -1) return (1 << 31) - 1;
        int result = 0;
        result = dividend / divisor;
        return result;
    }
}