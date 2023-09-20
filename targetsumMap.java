//Given an array of integers nums and an integer target,
//return indices of the two numbers such that they add up to target.
//java

import java.util.*;

public class targetsumMap {
    public int[] twosum(int[] num, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int current = num[i];
            int compliment = target - current;
            if (map.containsKey(compliment)) {
                return new int[] { map.get(current), i };
            }
            map.put(current, i);
        }
        return null;
    }
}