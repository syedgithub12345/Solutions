//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place 
//such that each unique element appears only once. The relative order of the elements should 
//be kept the same. Then return the number of unique elements in nums

import java.util.*;
public class duplicateremove {
    public int removeDuplicates(int[] nums){
        int index=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums){
            if(!set.contains(num)){
                set.add(num);
                nums[index++]=num;
            }
        }return set.size();
    }
}
