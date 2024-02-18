package com.dnanh01.service;

import java.util.List;

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
}
