// Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
//The returned integer should be non-negative as well.
//You must not use any built-in exponent function or operator.
//java

class sqroot {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        
        long left = 1;
        long right = x; 
        while (left <= right) {
            long mid = left + (right - left) / 2;
            
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
    }
}
