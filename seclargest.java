//************************************************** */
//second maximum element in an array
import java.util.*;

class main {
    public static int[] print2largest(int[] arr, int n) {
        Arrays.sort(arr);

        int[] result = new int[2];

        int largest = arr[n - 1];
        int secondLargest = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;
            }
        }

        int smallest = arr[0];
        int secondSmallest = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > smallest) {
                secondSmallest = arr[i];
                break;
            }
        }

        result[0] = secondSmallest;
        result[1] = secondLargest;

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2 };
        int n = arr.length;
        int[] result = print2largest(arr, n);
        System.out.println("Second Smallest: " + result[0]);
        System.out.println("Second Largest: " + result[1]);
    }
}

// *************************************************** */
// //second maximum element in an array
// class main {
// int print2largest(int arr[], int n) {

// Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

// for (int num : arr) {
// set.add(num);
// }
// if (set.size() < 2) {
// return -1;
// }
// Iterator<Integer> it = set.iterator();
// it.next();

// return it.next();
// }}
