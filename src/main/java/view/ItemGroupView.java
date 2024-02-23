package view;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {

	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {

		System.out.println("Demo second level cache");
		itemGroupService.secondLevelCache();

		System.out.println("\n\n");
		System.out.println("Lấy thông tin tất cả các loại hàng");
		List<ItemGroup> itemGroups = itemGroupService.getAll();

		itemGroups.forEach(group -> {
			System.out.println(">>>" + group);
			List<Item> items = group.getItems();
			items.forEach(System.out::println);
			System.out.println();
		});

		System.out.println("\n\n");
		System.out.println("Đếm số lượng các mặt hàng theo từng loại hàng");
		itemGroupService.getItemsByItemGroup()
				.forEach(System.out::println);
	}
}
