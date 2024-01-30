package collection.map.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Ex03SortedByKey {
    public static void main(String[] args) {
        Map<Integer, String> modelMap = new HashMap<>();
        modelMap.put(92, "Quang Nam");
        modelMap.put(null, "test city");
        modelMap.put(43, "Da Nang");
        modelMap.put(75, "Hue");
        sortedByKey(modelMap).forEach((k, v) -> System.out.println(k + " - " + v));
        ;
    }

    private static Map<Integer, String> sortedByKey(Map<Integer, String> map) {
        Set<Entry<Integer, String>> entrySet = map.entrySet();
        List<Entry<Integer, String>> listEntry = new ArrayList<>(entrySet);

        listEntry.sort(new Comparator<Entry<Integer, String>>() {
            @Override
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                Integer k1 = o1.getKey();
                Integer k2 = o2.getKey();

                if (k1 == null) {
                    return 1;
                }

                if (k2 == null) {
                    return -1;
                }
                return k1.compareTo(k2);
            }
        });

        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Entry<Integer, String> entry : listEntry) {
            sortedMap.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

}
