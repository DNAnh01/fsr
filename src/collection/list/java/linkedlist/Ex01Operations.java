package collection.list.java.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Ex01Operations {
    public static void main(String[] args) {
        List<String> elements = new LinkedList<>();

        elements.add("hello");
        elements.add("how are you");

        System.out.println("size: " + elements.size());

    }
}
