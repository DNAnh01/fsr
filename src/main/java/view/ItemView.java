package view;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemSizeRelation;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {

		List<Item> items = itemService.getAll();
		System.out.println("size: " + items.size());
		System.out.println("\n\n");

		ItemGroup itemGroup = items.get(0).getItemGroup();
		System.out.println("itemGroup 0: " + itemGroup);
		System.out.println("\n\n");

		System.out.println("Liệt kê tất cả các mặt hàng chứa thông tin loại hàng");
		items.forEach(System.out::println);
		System.out.println("\n\n");

		System.out.println("Sử dụng java lấy tất cả các mặt hàng của loại hàng đó -> Câu 1");
		Map<ItemGroup, List<Item>> itemGroups = items.stream().collect(Collectors.groupingBy(Item::getItemGroup));

		Iterator showItemGroups = itemGroups.entrySet().iterator();
		while (showItemGroups.hasNext()) {
			Map.Entry element = (Map.Entry) showItemGroups.next();
			System.out.println(element.getKey() + ":\n -> " + element.getValue() + "\n");
		}
		System.out.println("\n\n");
		Optional<Item> otpItem = itemService.get(10);
		if (otpItem.isPresent()) {
			System.out.println("Item 10: " + otpItem.get());
		}

		System.out.println("\n\n");
		if (itemService.find(5).isPresent()) {
			System.out.println("Item 5: " + itemService.find(5).get());
		}

		System.out.println("\n\n");
		System.out.println("Demo first level cache");
		itemService.demoHibernate1stLevelCache();

		System.out.println("\n\n");
		System.out.println("Liệt kê tất cả các mặt hàng chứa thông tin kích cỡ mặt hàng");
		Item item0 = items.get(0);
		List<ItemSizeRelation> itemSizeRelations = item0.getItemSizeRelations();
		System.out.println("item0: " + item0);
		System.out.println("itemSizeRelations: " + itemSizeRelations.size());
	}
}
