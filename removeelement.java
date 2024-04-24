class removeelement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

// //work in progress
// class removeelement {
// public int removeElement(int[] nums, int val) {
// int count=0;
// int idx=0;
// int[] arr=new int[nums.length];
// for(int num:nums){
// if(num!=val){
// count++;
// arr[idx++]=num;
// }
// }return count;
// // for(int i=nums.length-count;i<nums.length;i++){
// // nums[i]=0;
// // }
// // return nums;
// }
// }