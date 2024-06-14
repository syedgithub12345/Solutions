//*************************************************** */
//second maximum element in an array

import java.util.*;
public class secondmaxno {
    int print2largest(int arr[], int n) {
        
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : arr) {
            set.add(num);
        }
        if (set.size() < 2) {
            return -1;
        }
        Iterator<Integer> it = set.iterator();
        it.next();
        
        return it.next();
    }}
