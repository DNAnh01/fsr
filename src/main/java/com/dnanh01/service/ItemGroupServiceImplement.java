package com.dnanh01.service;

import java.util.List;

import com.dnanh01.dao.ItemGroupDao;
import com.dnanh01.dao.JdbcItemGroupDao;
import com.dnanh01.persistence.ItemGroup;
import com.dnanh01.persistence.ItemGroupDto;

public class ItemGroupServiceImplement implements ItemGroupService {
    private final ItemGroupDao itemGroupDao;

    public ItemGroupServiceImplement() {
        itemGroupDao = new JdbcItemGroupDao();
    }

    @Override
    public List<ItemGroup> getAll() {
        return itemGroupDao.getAll();
    }

    @Override
    public List<ItemGroupDto> getItemGroups() {
        return itemGroupDao.getItemGroups();
    }
}
