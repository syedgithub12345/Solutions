//insertion sort
public class insertion {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 90, 12, 1, 76, 9 };
        int n = arr.length;
        System.out.println("Before insertion sort :");
        for (int l : arr) {
            System.out.print(l + " ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("After sorting :");
        for (int m : arr) {
            System.out.print(m + " ");
        }
    }
}
