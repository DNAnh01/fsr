package collection.map.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Ex02SortedByValue {
    public static void main(String[] args) {
        Map<Integer, String> modelMap = new HashMap<>();
        modelMap.put(92, "Quảng Nam");
        modelMap.put(43, "Đà Nẵng");
        modelMap.put(75, "Thừa Thiên Huế");
        modelMap.put(74, "Quảng Trị");
        modelMap.putIfAbsent(43, "ĐN");
        modelMap.put(36, null);

        Map<Integer, String> sortedMap = sortedByValue(modelMap);
        for (Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry);
        }
    }

    private static Map<Integer, String> sortedByValue(Map<Integer, String> map) {

        // B1: map<Entry<K, V>> --> set<Entry<K, V>> --> list<Entry<K, V>>
        // B2: sort list by value
        // B3: put entries from sorted list into new map
        // B4: return new map
        Set<Entry<Integer, String>> entrySet = map.entrySet();

        List<Entry<Integer, String>> entryList = new ArrayList<>(entrySet);
        // TODO: NPE
        // entryList.sort(Comparator.nullsLast(Comparator.comparing(e ->
        // e.getValue())));

        entryList.sort(new Comparator<Entry<Integer, String>>() {

            @Override
            public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
                String v1 = e1.getValue();
                String v2 = e2.getValue();
                if (v1 == null) {
                    return -1;
                }
                if (v2 == null) {
                    return 1;
                }
                return v1.compareTo(v2);
            }
        });

        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Entry<Integer, String> entry : entryList) {
            sortedMap.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
