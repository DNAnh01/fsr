package com.dnanh01.service;

import java.util.List;

import com.dnanh01.persistence.ItemGroup;
import com.dnanh01.persistence.ItemGroupDto;

public interface ItemGroupService {
    List<ItemGroup> getAll();

    List<ItemGroupDto> getItemGroups();

    ItemGroup getItemById(Integer itemGroupId);

    void saveOrUpdate(ItemGroup itemGroup);

    void save(List<ItemGroup> itemGroups);

    List<ItemGroup> getItemGroupDetails();

    List<ItemGroup> search(String name);
}
