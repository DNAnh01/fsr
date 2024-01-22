package exercises;

import java.util.HashMap;
import java.util.Map;

public class Ex0387FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123]; // 97 -> 122
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c;
            count[index]++;

        }

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c;
            if (count[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqCharUsingHashMap(String s) {
        char[] cs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        // key is the value of the element in the Map
        // value is number of times an element appears in the Map

        for (char c : cs) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int numberOfOccurrences = map.get(c);
                numberOfOccurrences++;
                map.put(c, numberOfOccurrences);
            }
        }
        System.out.println("-----------------");
        System.out.println(s);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " appeared " + entry.getValue() + " times");
        }

        for (int i = 0; i < cs.length; i++) {
            if (map.get(cs[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqCharUsingHashMap(s));
    }
}
