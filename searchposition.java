//Given a sorted array of distinct integers and a target value, 
//return the index if the target is found. If not, return the 
//index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
//java

class searchposition {
    public int searchInsert(int[] nums, int target) {
        int ans=0;
        int n=nums.length+1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans=i;
                break;
            }
                if(nums[i]>=target){
            return ans;
        }ans++;
        
        }return ans;
}}