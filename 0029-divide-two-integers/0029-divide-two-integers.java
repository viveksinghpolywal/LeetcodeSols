class Solution {
    public int divide(int dividend, int divisor) {
        // Handle special case: division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Perform division using long to avoid overflow
        long result = (long) dividend / divisor;

        // Check if the result is within the range of int
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }
}
