//Given an integer array nums sorted in non-decreasing order,
//remove the duplicates in-place such that each unique element appears only once.
//The relative order of the elements should be kept the same. 
//Then return the number of unique elements in nums.
//java

public class removeduplicate {

    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}