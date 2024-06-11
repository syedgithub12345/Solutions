//*************************************** */
// Print the following Pattern and get the output to match test cases?
// To print the pattern like
// for n=3
// the program should print
// 1 1 1 2
// 3 2 2 2
// 3 3 3 4

class pattern5 {
    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                if (i % 2 != 0) {
                    if (j <= n)
                        System.out.print(k + " ");
                    else
                        System.out.print(k + 1 + " ");
                } else {
                    if (j == 1) {
                        System.out.print(k + 1 + " ");
                    } else {
                        System.out.print(k + " ");
                    }
                }
            }
            System.out.println();
            k++;
        }
    }
}