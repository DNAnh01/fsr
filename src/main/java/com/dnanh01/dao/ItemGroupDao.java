package com.dnanh01.dao;

import java.util.List;

import com.dnanh01.persistence.ItemGroup;
import com.dnanh01.persistence.ItemGroupDto;

public interface ItemGroupDao {

    List<ItemGroup> getAll();

    List<ItemGroupDto> getItemGroups();

    ItemGroup getItemGroupById(Integer itemGroupId);

}
