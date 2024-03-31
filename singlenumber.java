public class singlenumber {
    public static int singlenum(int[] nums){
        int result=0;
        for(int num:nums){
            result^=num;
        }return result;
    }
    public static void main(String[] args) {
        int[] nums={2,3,4,5,2,3,4,6,7,6,7};
        System.out.println(singlenum(nums));
    }
}

//or
// import java.util.*;
// class Solution {
//     public int singleNumber(int[] nums) {
//         int count=0;
//         HashSet<Integer> set=new HashSet<>();
//         for(int num:nums){
//             if(!set.add(num)){
//                 set.remove(num);
//             }
//         }return set.iterator().next();
//     }
// }