package com.dnanh01.view;

import com.dnanh01.service.ItemGroupService;
import com.dnanh01.service.ItemGroupServiceImplement;

public class ItemGroupView {
    private static final ItemGroupService itemGroupService; // compile

    static {
        itemGroupService = new ItemGroupServiceImplement(); // runtime
    }

    public static void main(String[] args) {
        // System.out.println("get all item group");
        // itemGroupService.getAll().forEach(System.out::println);

        // System.out.println("get item-groups");
        // itemGroupService.getItemGroups().forEach(System.out::println);

        // System.out.println("get item-group by id");
        // System.out.println(itemGroupService.getItemById(1));

        // System.out.println("save item-group");

        // System.out.println("get item-group details");
        // itemGroupService.getItemGroupDetails().forEach(System.out::println);

        System.out.println("search for a list of item-groups with the item-group name");
        itemGroupService.search("Thắt").forEach(System.out::println);
    }
}
