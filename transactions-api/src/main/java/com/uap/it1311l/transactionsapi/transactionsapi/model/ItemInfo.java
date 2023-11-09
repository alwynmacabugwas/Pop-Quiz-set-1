package com.uap.it1311l.transactionsapi.transactionsapi.model;

public class ItemInfo {
	int barcode;
	String itemName;
	int price;
	int quantity;
	
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
