package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("--------------1. Get all itemGroups--------------");
		itemGroupService.getAll().forEach(System.out::println);
	}
}
