package com.dnanh01.service;

import java.util.List;

import com.dnanh01.persistence.ItemGroup;
import com.dnanh01.persistence.ItemGroupDto;

public interface ItemGroupService {
    List<ItemGroup> getAll();

    List<ItemGroupDto> getItemGroups();
}
