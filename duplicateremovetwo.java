class duplicateremovetwo {
    public int removeDuplicates(int[] nums) {
        int in = 2;
        if (nums.length < 3) {
            return nums.length;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[in - 2]) {
                nums[in++] = nums[i];
            }
        }
        return in;
    }
}