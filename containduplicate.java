//Given an integer array nums, return true if any value appears at least 
//twice in the array, and return false if every element is distinct.

import java.util.*;
class Solution{
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(!set.add(i)){
                return true;
            }
        }return false;
    }
}


//or

// import java.util.*;
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]==nums[i+1]){
//                 return true;
//             }
//         }return false;
//     }
// }

//or


// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }
//         }return false;
//     }
// }


//or


// public class containduplicate {
//     public boolean containsDuplicate(int[] nums) {
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] == nums[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 2, 3, 3, 4, 4, 1 };
//         containduplicate c = new containduplicate();
//         System.out.println(c.containsDuplicate(nums));
//     }
// }

