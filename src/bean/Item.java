package bean;

import java.util.Objects;

public class Item {
    private Integer itemId;
    private Integer storeId;
    private String name;
    private Double price;

    public Item() {
    }

    public Item(Integer itemId, Integer storeId, String name, Double price) {
        this.itemId = itemId;
        this.storeId = storeId;
        this.name = name;
        this.price = price;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", storeId=" + storeId + ", name=" + name + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemId(), getName(), getStoreId(), getPrice());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Item)) {
            return false;
        }
        Item other = (Item) obj;

        return this.getItemId().equals(other.getItemId()) &&
                this.getName().equals(other.getName()) &&
                this.getPrice().equals(other.getPrice()) &&
                this.getStoreId().equals(other.getStoreId());
    }
}
