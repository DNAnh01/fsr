package persistence;

public class ItemGroupDto {
	

	public static final String ITEM_GROUP_ID = "itemGroupId";
	public static final String ITEM_GROUP_NAME = "itemGroupName";
	public static final String ITEMS = "items";
	public static final String TOTAL_OF_ITEMS = "totalOfItems";
	
	private Integer itemGroupId;
	private String itemGroupName;
	private String items;
	private Integer totalOfItems;
	
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer itemGroupId, String itemGroupName, String items, Integer totalOfItems) {
		this.itemGroupId = itemGroupId;
		this.itemGroupName = itemGroupName;
		this.items = items;
		this.totalOfItems = totalOfItems;
	}

	public Integer getItemGroupId() {
		return itemGroupId;
	}

	public void setItemGroupId(Integer itemGroupId) {
		this.itemGroupId = itemGroupId;
	}

	public String getItemGroupName() {
		return itemGroupName;
	}

	public void setItemGroupName(String itemGroupName) {
		this.itemGroupName = itemGroupName;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public Integer getTotalOfItems() {
		return totalOfItems;
	}

	public void setTotalOfItems(Integer totalOfItems) {
		this.totalOfItems = totalOfItems;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [itemGroupId=" + itemGroupId + ", itemGroupName=" + itemGroupName + ", items=" + items
				+ ", totalOfItems=" + totalOfItems + "]";
	}
}
