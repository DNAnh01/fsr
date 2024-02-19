package com.dnanh01.view;

import com.dnanh01.service.ItemService;
import com.dnanh01.service.ItemServiceImplement;

public class ItemView {
    private static ItemService itemService;

    static {
        itemService = new ItemServiceImplement();
    }

    public static void main(String[] args) {
        System.out.println("get all item");
        itemService.getAll().forEach(System.out::println);

        System.out.println("get item by item-group name");
        itemService.getItems("Th").forEach(System.out::println);
    }
}
