// distinct elements in an array
public class distinct {
    public static int countUniqueNumbers(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // At least the first element is unique

        for (int i = 1; i < nums.length; i++) {
            boolean isUnique = true;

            // Check if nums[i] is equal to any previous elements
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 8, 5, 9, 2, 8, 10 };
        int uniqueCount = countUniqueNumbers(nums);
        System.out.println("Number of unique numbers: " + uniqueCount);
    }
}
