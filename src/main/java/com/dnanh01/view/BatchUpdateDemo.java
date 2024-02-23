package com.dnanh01.view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.dnanh01.persistence.ItemGroup;
import com.dnanh01.service.ItemGroupService;
import com.dnanh01.service.ItemGroupServiceImplement;

public class BatchUpdateDemo {
    private static final String PATH = "src/main/java/com/dnanh01/LoaiHang.txt";

    private static ItemGroupService itemGroupService;

    static {
        itemGroupService = new ItemGroupServiceImplement();
    }

    public static void main(String[] args) {
        List<ItemGroup> itemGroups = readFile();
        if (!itemGroups.isEmpty()) {
            itemGroupService.save(itemGroups);
        } else {
            System.out.println("No data read from file. Please check if the file exists and is accessible.");
        }
    }

    private static List<ItemGroup> readFile() {

        try {
            Files.readAllLines(new File(PATH).toPath()).forEach(System.out::println);
            return Files
                    .readAllLines(new File(PATH).toPath())
                    .stream()
                    .map(ItemGroup::new)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
