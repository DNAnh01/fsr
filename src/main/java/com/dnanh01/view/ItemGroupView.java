package com.dnanh01.view;

import com.dnanh01.service.ItemGroupService;
import com.dnanh01.service.ItemGroupServiceImplement;

public class ItemGroupView {
    private static final ItemGroupService itemGroupService; // compile

    static {
        itemGroupService = new ItemGroupServiceImplement(); // runtime
    }

    public static void main(String[] args) {
        System.out.println("get all item group");
        itemGroupService.getAll().forEach(System.out::println);

        System.out.println("get item-groups");
        itemGroupService.getItemGroups().forEach(System.out::println);
    }
}
