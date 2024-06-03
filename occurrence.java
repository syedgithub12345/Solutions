

//********************************** */
// count the number of occurrence of a number in other number
public class occurrence {
    public static int isOccurred(int num1, int num2) {
        int frequency = 0;
        String s=String.valueOf(num1);
        String substring=String.valueOf(num2);
        int index = s.indexOf(substring); // Find the first occurrence of the substring in the string
        while (index != -1) {
            frequency++; // Increment the frequency count
            index = s.indexOf(substring, index + 1); // Find the next occurrence of the substring
        }
        return frequency;
    }

    public static void main(String[] args) {
        int num1 = 123451235;
        int num2 = 123;
        int occurrences = isOccurred(num1, num2);
        System.out.println("Number of occurrences of " + num2 + " in " + num1 + ": " + occurrences);
    }
}