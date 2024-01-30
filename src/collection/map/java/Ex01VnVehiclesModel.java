package collection.map.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.function.Function;

public class Ex01VnVehiclesModel {
    public static void main(String[] args) {
        // Map<Integer, String> modelMap = new HashMap<>();
        // Map<Integer, String> modelMap = new LinkedHashMap<>();
        Map<Integer, String> modelMap = new TreeMap<>(
                Comparator.nullsLast(Comparator.comparing(Function.identity())));
        modelMap.put(92, "Quang Nam");
        modelMap.put(43, "Da Nang");
        modelMap.put(75, "Hue");
        modelMap.put(74, "Quang Tri");

        // modelMap.put(43, "ĐN"); // if key exists --> override value
        modelMap.putIfAbsent(74, "QT"); // if key exists --> do nothing
        modelMap.put(null, "Test City");

        System.out.println("modelMap.size(): " + modelMap.size());
        modelMap.forEach((k, v) -> System.out.println(k + " - " + v));

        Set<Entry<Integer, String>> entrySet = modelMap.entrySet();
        Set<Integer> keySet = modelMap.keySet();

        for (Entry<Integer, String> model : entrySet) {
            System.out.println("model: " + model.getKey() + ", " + model.getValue());
        }

        System.out.println("========Key Iterator=======");
        for (Integer key : keySet) {
            System.out.print(key + "--->" + modelMap.get(key));
        }

        System.out.println("\n=========== Get || Default =========");
        int inputSearch = 74;
        String value = modelMap.getOrDefault(inputSearch, "Undefined");
        System.out.println("Value: " + value);
    }
}
