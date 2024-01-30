package collection.set.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicDemo {
    public static void main(String[] args) {
        // Set<Integer> uniqueElements = new HashSet<>();
        // Set<Integer> uniqueElements = new LinkedHashSet<>();
        Set<Integer> uniqueElements = new TreeSet<>();

        uniqueElements.add(1);
        uniqueElements.add(2);
        uniqueElements.add(3);
        uniqueElements.add(4);
        uniqueElements.add(5);
        uniqueElements.add(6);
        uniqueElements.add(1);
        System.out.println("uniqueElements.size(): " + uniqueElements.size());
        uniqueElements.forEach(k -> System.out.print(k + " "));
    }
}
