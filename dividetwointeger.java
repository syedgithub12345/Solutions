//Given two integers dividend and divisor, divide two integers without using 
//multiplication, division, and mod operator. The integer division should truncate toward zero, 
//which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 
//would be truncated to -2. Return the quotient after dividing dividend by divisor.
//java

class dividetwointeger {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        long quotient = 0;
        while (ldividend >= ldivisor) {
            long temp = ldivisor;
            long multiple = 1;
            while (ldividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            ldividend -= temp;
            quotient += multiple;
        }
        return (int) (sign * quotient);
    }
}