//selection sort
public class selection {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 3, 4, 6, 9, 0, 5, 10 };
        int n = arr.length;
        int i, j, minindex = -1;
        int temp;

        System.out.println("Before selection sorting :");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        for (i = 0; i < n - 1; i++) {
            minindex = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After sorting :");
        for (int l = 0; l < n; l++) {
            System.out.print(arr[l] + " ");
        }
    }
}
