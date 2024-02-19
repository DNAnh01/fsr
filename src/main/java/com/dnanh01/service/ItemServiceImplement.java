package com.dnanh01.service;

import java.util.List;
import java.util.Objects;

import com.dnanh01.dao.ItemDao;
import com.dnanh01.dao.JdbcItemDao;
import com.dnanh01.persistence.Item;

public class ItemServiceImplement implements ItemService {
    private ItemDao itemDao;

    public ItemServiceImplement() {
        itemDao = new JdbcItemDao();
    }

    @Override
    public List<Item> getAll() {
        return itemDao.getAll();
    }

    @Override
    public List<Item> getItems(String itemGroupName) {
        Objects.requireNonNull(itemGroupName, "item-group name can not be null");
        return itemDao.getItems(itemGroupName);
    }
}
