package com.dnanh01.view;

import com.dnanh01.service.ItemService;
import com.dnanh01.service.ItemServiceImplement;

public class ItemView {
    private static ItemService itemService;

    static {
        itemService = new ItemServiceImplement();
    }

    public static void main(String[] args) {
        itemService.getAll().forEach(System.out::println);
    }
}
