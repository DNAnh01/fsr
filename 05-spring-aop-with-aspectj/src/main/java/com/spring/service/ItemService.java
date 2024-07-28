package com.spring.service;

// step 1: create JoinPoint class
public class ItemService {
	private String itemName;
	private double itemPrice;

	public ItemService() {
	}

	public ItemService(String itemName, double itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	// Join Point methods
	public void printItemName() {
		System.out.println("#Join Point-> Item Name: " + itemName);
	}

	// Join Point methods
	public void printItemPrice() {
		System.out.println("#Join Point-> Item Price: " + itemPrice);
	}
}
