import java.util.*;

class groupanagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new LinkedList<>());
            }
            map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());
    }
}