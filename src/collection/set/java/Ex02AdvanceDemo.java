package collection.set.java;

import java.util.HashSet;
import java.util.Set;

import bean.Item;

public class Ex02AdvanceDemo {
    public static void main(String[] args) {
        Set<Item> items = new HashSet<>();

        items.add(new Item(101, 1, "Item 101", 220d));

        items.add(new Item(102, 1, "Item 102", 120d));
        items.add(new Item(103, 1, "Item 103", 320d));
        items.add(new Item(104, 1, "Item 104", 520d));

        items.add(new Item(102, 1, "Item 102", 120d));

        System.out.println("size: " + items.size());

        items.forEach(i -> System.out.println(i.getItemId()));
    }
}
