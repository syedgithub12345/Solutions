//******************************** */
//Greatest Common Divisor
public class gcd {
    public static int gcdIter(int u, int v) {
        int t;
        while (v != 0) {
            t = u;
            u = v;
            v = t % v;
        }
        return u < 0 ? -u : u;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 6;
        int result = gcdIter(n, m);
        System.out.println(result);
    }
}