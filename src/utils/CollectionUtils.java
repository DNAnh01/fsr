package utils;

import java.util.List;

import bean.Item;

public class CollectionUtils {
    private CollectionUtils() {
    }

    public static void printItem(List<Item> items) {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public static void printString(List<String> elements) {
        for (String element : elements) {
            System.out.println(element);
        }
    }

    public static void printInteger(List<Integer> elements) {
        for (Integer element : elements) {
            System.out.println(element);
        }
    }
}
