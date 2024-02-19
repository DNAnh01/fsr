package com.dnanh01.persistence;

import java.util.List;

public class ItemGroupDto {
    private Integer itemGroupId;
    private String itemGroupName;
    private Integer amountOfItems;
    private List<ItemDto> items;

    public ItemGroupDto() {
    }

    public ItemGroupDto(Integer itemGroupId, String itemGroupName, Integer amountOfItems, List<ItemDto> items) {
        this.itemGroupId = itemGroupId;
        this.itemGroupName = itemGroupName;
        this.amountOfItems = amountOfItems;
        this.items = items;
    }

    public static class Builder {

        private Integer itemGroupId;
        private String itemGroupName;
        private Integer amountOfItems;
        private List<ItemDto> items;

        private Builder() {
        }

        public Builder ItemGroupId(Integer itemGroupId) {
            this.itemGroupId = itemGroupId;
            return this;
        }

        public Builder ItemGroupName(String itemGroupName) {
            this.itemGroupName = itemGroupName;
            return this;
        }

        public Builder AmountOfItems(Integer amountOfItems) {
            this.amountOfItems = amountOfItems;
            return this;
        }

        public Builder Items(List<ItemDto> items) {
            this.items = items;
            return this;
        }

        public ItemGroupDto build() {
            return new ItemGroupDto(this);
        }

    }

    public Builder builder() {
        return new Builder();
    }

    public ItemGroupDto(Builder builder) {
        this.itemGroupId = builder.itemGroupId;
        this.itemGroupName = builder.itemGroupName;
        this.amountOfItems = builder.amountOfItems;
        this.items = builder.items;
    }

    public Integer getItemGroupId() {
        return itemGroupId;
    }

    public String getItemGroupName() {
        return itemGroupName;
    }

    public Integer getAmountOfItems() {
        return amountOfItems;
    }

    public List<ItemDto> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "ItemGroupDto [itemGroupId=" + itemGroupId + ", itemGroupName=" + itemGroupName + ", amountOfItems="
                + amountOfItems + ", items=" + items + "]";
    }
}
