package com.dnanh01.dao;

import java.util.List;

import com.dnanh01.persistence.Item;

public interface ItemDao {
    List<Item> getAll();

    List<Item> getItems(String itemGroupName);

}
