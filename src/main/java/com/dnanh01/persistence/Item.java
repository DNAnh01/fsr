package com.dnanh01.persistence;

public class Item {
    private Integer itemId;
    private String name;
    private String color;

    private ItemGroup itemGroup; // mapping 1-N

    public Item() {
    }

    public Item(Integer itemId, String name, String color, ItemGroup itemGroup) {
        this.itemId = itemId;
        this.name = name;
        this.color = color;
        this.itemGroup = itemGroup;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ItemGroup getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(ItemGroup itemGroup) {
        this.itemGroup = itemGroup;
    }

    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", name=" + name + ", color=" + color + ", itemGroup=" + itemGroup + "]";
    }
}
