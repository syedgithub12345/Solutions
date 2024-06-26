//bubble sort
public class bubble {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 79, 35, 5 };
        int n = arr.length;
        int temp;
        System.out.println("Before bubble sort :");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After bubble sort :");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

        // improved bubble sort
        // int[] arr1 = { 3, 4, 54, 546, 646, 41, 5, 87, 0, 97 };
        // boolean swapped;
        // for (int l = 0; l < n - 1; l++) {
        // swapped = false;
        // for (int m = 0; m < n - 1 - l; m++) {
        // if (arr[m] > arr[m + 1]) {
        // int temp1 = arr[m];
        // arr[m] = arr[m + 1];
        // arr[m + 1] = temp1;
        // swapped = true;
        // }
        // }
        // If no two elements were swapped by inner loop, then the array is sorted
        // if (!swapped)
        // break;
        // }
        // System.out.println("Implementing improved bubble sort :");
        // for (int p = 0; p < n; p++) {
        // System.out.print(arr[p] + " ");
        // }
    }
}
