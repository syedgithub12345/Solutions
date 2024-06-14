
//*************************************
//third maximum number
import java.util.*;

class thirdmaxno {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : nums) {
            set.add(num);
        }

        // If there are less than 3 distinct numbers, return the maximum
        if (set.size() < 3) {
            return set.iterator().next();
        }

        // Get the third maximum
        Iterator<Integer> it = set.iterator();
        it.next(); // First maximum
        it.next(); // Second maximum
        return it.next(); // Third maximum
    }
}