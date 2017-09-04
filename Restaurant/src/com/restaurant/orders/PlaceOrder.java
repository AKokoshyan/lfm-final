package com.restaurant.orders;

import java.util.ArrayList;

import com.restaurant.items.Item;
import com.restaurant.menu.Menu;

public class PlaceOrder {

	// Set default value for class variables for double 0, for String undefined!

	private ArrayList<Order> orders;
	private ArrayList<Item> availableItem;
	private int orderQuantity;
	private double ordersPrice;

	// Constructors
	public PlaceOrder(Menu menu) {
		setAvailableItems(menu);
		orders = new ArrayList<>();
		this.orderQuantity = 0;
		this.ordersPrice = 0.0;
	}

	// Setters and getters
	private void setAvailableItems(Menu menu) {
		if (menu != null) {
			this.availableItem = menu.getItems();
		} else {
			this.availableItem = null;
		}
	}

	public ArrayList<Order> getOrder() {
		return this.orders;
	}

	public double getOrdersPrice() {
		return this.ordersPrice;
	}

	// Public methods
	public void orderItem(String item, int quantity) {
		if (availableItem != null) {
			for (int i = 0; i < availableItem.size(); i++) {
				if (availableItem.get(i).getName().equals(item)) {
					if (availableItem.get(i).getQuantity() > quantity) {
						orders.add(new Order(item, quantity));
						this.orderQuantity += quantity;
						this.ordersPrice += (availableItem.get(i).getCost() * quantity);
						availableItem.get(i).setQuantity(availableItem.get(i).getQuantity() - quantity);
						break;
					} else if (availableItem.get(i).getQuantity() == quantity) {
						orders.add(new Order(item, quantity));
						this.orderQuantity += quantity;
						this.ordersPrice += (availableItem.get(i).getCost() * quantity);
						availableItem.remove(i);
						break;
					}
				}
			}
		}
	}

}
