//Given an array nums with n objects colored red, white, or blue, 
//sort them in-place so that objects of the same color are adjacent, 
//with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color 
//red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.
//java

//The Dutch National Flag algorithm sorts the array in a single pass without extra space.

class sortcolors {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int current = 0;

        while (current <= high) {
            if (nums[current] == 0) {
                swap(nums, low, current);
                low++;
                current++;
            } else if (nums[current] == 2) {
                swap(nums, current, high);
                high--;
            } else {
                current++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
