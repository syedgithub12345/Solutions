
//The function accepts two integers n, m as arguments 
//Find the sum of all numbers in range from 1 to m(both inclusive) 
//that are not divisible by n. Return difference between sum of 
//integers not divisible by n with sum of numbers divisible by n.
//java
import java.util.*;

public class differencesum {
    public static int differenceofsum(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i < m; i++) {
            if (i % n == 0) {
                sum1 = sum1 + i;
            } else {
                sum2 = sum2 + i;
            }
        }
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(differenceofsum(n, m));
    }
}