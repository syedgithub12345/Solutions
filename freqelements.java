//********************************* */
// frequency of each element in a array
import java.util.*;

public class freqelements {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 5, 4, 3, 9 };
        Arrays.sort(arr);

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            } else {
                System.out.println("Frequency of " + arr[i - 1] + " = " + count);
                count = 1;
            }
        }
        System.out.println("Frequency of " + arr[arr.length - 1] + " = " + count);
    }
}
