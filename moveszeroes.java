import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr=new int[nums.length];
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[idx++]=nums[i];
            }
        }
        for(int i=nums.length-count;i<nums.length;i++){
            nums[i]=0;
        }
    }
}

// //work in progress
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Integer[] arr = {5, 2, 7, 1, 9, 3};

//         Arrays.sort(arr, Collections.reverseOrder());
//         System.out.println("Array sorted in descending order:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// //*****************************/
// // work progress
// import java.util.*;
// public class Solution{
//     public void moveZeroes(int[] nums){
//         Arrays.sort(nums);
//     }
// }
