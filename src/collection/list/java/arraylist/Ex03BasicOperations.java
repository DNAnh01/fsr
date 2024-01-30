package collection.list.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03BasicOperations {
    public static void main(String[] args) {
        List<String> sequences = new ArrayList<>();
        // List has an attribute --> Object[] elementData
        // B1: Initial an empty array of objects --> elementData, length=0
        System.out.println("sequences.size(): " + sequences.size()); // 0

        // best practice: when we know max element store in list
        // --> call constructor with initialCapacity to reduce create, copy elemenData
        // to new one

        sequences.add("A");
        sequences.add("B");
        sequences.add("C");
        sequences.add("D");
        sequences.add(2, "B1");

        sequences.forEach(s -> System.out.println(sequences.indexOf(s) + ": " + s));
        /**
         * 0: A
         * 1: B
         * 2: B1
         * 3: C
         * 4: D
         */

        List<String> text = new ArrayList<>();

        text.add("M");
        text.add("N");
        text.add("O");
        text.add("P");
        text.add("A");

        text.add("M2");
        text.add("M3");
        text.add("N1");
        text.add("N2");

        text.forEach(t -> System.out.println(text.indexOf(t) + ": " + t));
        /**
         * 0: M
         * 1: N
         * 2: O
         * 3: P
         * 4: A
         * 5: M2
         * 6: M3
         * 7: N1
         * 8: N2
         */

        sequences.addAll(text);
        System.out.println("sequences.size(): " + sequences.size());

        // GET, SET operation
        text.set(0, "M1");
        System.out.println("Index 0: " + text.get(0));

        text.forEach(t -> System.out.println(text.indexOf(t) + ": " + t));

        // ITERATE --> FOR-EACH|INDEX

        System.out.println("ITERATE --> FOR-EACH|INDEX");
        Iterator<String> iterator = sequences.iterator();
        while (iterator.hasNext()) {
            String val = iterator.next();
            System.out.println("value: " + val);
        }

        System.out.println("========= REMOVE ==========");

        // REMOVE
        // text --> M1, N, O P
        text.remove(1);
        text.remove("P");
        // text --> M1, O, A
        // sequences --> A, B, B1, C, D
        text.removeAll(sequences);
        // text --> M1, O, M2, M3, N1, N2
        text.removeIf(element -> element.startsWith("N"));
        text.forEach(t -> System.out.println(text.indexOf(t) + ": " + t));

        // INDEXOF, CONTAIN
        System.out.println("text index of M2: " + text.indexOf("M2"));

        System.out.println("text contains O ? " + text.contains(new String("O")));
    }
}
