package shopping.models;

import java.util.Arrays;

public class ItemGroup {
    private int id;
    private String name;
    private Item[] items;

    public ItemGroup() {
    }

    public ItemGroup(int id, String name, Item[] items) {
        this.id = id;
        this.name = name;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ItemGroup [id=" + id + ", name=" + name + ", items=" + Arrays.toString(items) + "]";
    }
}