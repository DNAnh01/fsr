package com.dnanh01.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import com.dnanh01.dao.ItemDao;
import com.dnanh01.dao.ItemGroupDao;
import com.dnanh01.dao.JdbcItemDao;
import com.dnanh01.dao.JdbcItemGroupDao;
import com.dnanh01.persistence.Item;
import com.dnanh01.persistence.ItemGroup;
import com.dnanh01.persistence.ItemGroupDto;

public class ItemGroupServiceImplement implements ItemGroupService {
    private final ItemGroupDao itemGroupDao;
    private final ItemDao itemDao;

    public ItemGroupServiceImplement() {
        itemGroupDao = new JdbcItemGroupDao();
        itemDao = new JdbcItemDao();
    }

    @Override
    public List<ItemGroup> getAll() {
        return itemGroupDao.getAll();
    }

    @Override
    public List<ItemGroupDto> getItemGroups() {
        return itemGroupDao.getItemGroups();
    }

    @Override
    public ItemGroup getItemById(Integer itemGroupId) {
        return itemGroupDao.getItemGroupById(itemGroupId);
    }

    @Override
    public void saveOrUpdate(ItemGroup itemGroup) {
        if (Optional.ofNullable(itemGroupDao.getItemGroupById(itemGroup.getId())).isPresent()) {
            itemGroupDao.update(itemGroup);
            System.out.println("ig is existed --> executing update ...");
        } else {
            itemGroupDao.save(itemGroup);
            System.out.println("ig is not exist --> executing save ...");
        }

    }

    @Override
    public void save(List<ItemGroup> itemGroups) {
        itemGroupDao.save(itemGroups);
    }

    @Override
    public List<ItemGroup> getItemGroupDetails() {
        /*
         * items
         * idA1, nameA1, colorA1, itemGroupA
         * idA2, nameA2, colorA2, itemGroupA
         * 
         * idB1, nameB1, colorB1, itemGroupB
         * idB2, nameB2, colorB2, itemGroupB
         * 
         * 
         * idC1, nameC1, colorC1, itemGroupC
         * idC2, nameC2, colorC2, itemGroupC
         * 
         * ==> itemGroups
         * itemGroupA, List<Item>
         * itemGroupB, List<Item>
         */

        return itemDao
                .getAll()
                .stream()
                .collect(Collectors.groupingBy(Item::getItemGroup))
                .entrySet()
                .stream()
                .map(ItemGroup::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<ItemGroup> search(String name) {
        Objects.requireNonNull(name, "item-group name require non null ... ");
        return itemGroupDao.search(name);
    }
}
