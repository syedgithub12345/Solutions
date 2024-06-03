//*************************** */
// Programming Pattern to Print 2*N Number of rows for input Pattern?
// 3
// 44
// 555
// 6666
// 555
// 44
// 3

public class pattern3 {

    public static void main(String[] args) {

        int n = 4, num = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)

                System.out.print(num);
            num++;
            System.out.println();

        }

        num = num - 2;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(num);
            num--;
            System.out.println();
        }
    }
}