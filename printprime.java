//*************************** */
//print the prime numbers
public class printprime {
    public static void main(String[] args) {
        int N = 20;
        boolean isFirstPrime = true;
        for (int i = 2; i <= N; i++) { // Start from 2 since 1 is not a prime number
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                if (!isFirstPrime) {
                    System.out.print(",");
                }
                System.out.print(i);
                isFirstPrime = false;
            }
        }
    }
}