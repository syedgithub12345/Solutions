// Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] 
//such that i < j < k and nums[i] < nums[k] < nums[j].
//Return true if there is a 132 pattern in nums, otherwise, return false.

// class pattern132 {
//     public boolean find132pattern(int[] nums) {
//         int n = nums.length;
//         int leftMin = nums[0];
//         for (int j = 1; j < n - 1; j++) {
//             for (int k = j + 1; k < n; k++) {
//                 if (nums[k] > leftMin && nums[j] > nums[k])
//                     return true;
//             }
//             leftMin = Math.min(nums[j], leftMin);
//         }
//         return false;
//     }
// }

//or

public class pattern132 {
    public boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ak = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; --i) {
            if (nums[i] < ak)
                return true;
            while (!stack.isEmpty() && stack.peek() < nums[i])
                ak = stack.pop();
            stack.push(nums[i]);
        }
        return false;
    }
}