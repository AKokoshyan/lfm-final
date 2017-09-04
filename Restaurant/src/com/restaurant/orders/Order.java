package com.restaurant.orders;

import com.restaurant.items.Item;

public class Order {

	// Set default value for class variables for double 0, for String undefined!

	private String name;
	private int quantity;

	// Constructors
	public Order(String item, int quantity) {
		setQuantity(quantity);
		setName(item);
	}

	// Getters and setters
	private void setName(String item) {
		if (item != null) {
			this.name = item;
		} else {
			this.name = "undefined";
		}
	}

	private void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			this.quantity = 0;
		}
	}

}
