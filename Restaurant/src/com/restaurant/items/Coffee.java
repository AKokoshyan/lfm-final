package com.restaurant.items;

import com.restaurant.items.Item.Category;
import com.restaurant.items.container.Container;

public class Coffee extends HotDrinks {
	// Set default value for class variables for double 0, for String undefined!

	// Constructors
	public Coffee(String name, double cost, int quantity) {
		super(name, cost, quantity);
	}

	// Getters and setters

	@Override
	public String packagingMaterials() {
		return this.hotDrinkContainer.packagingMaterials();
	}

	@Override
	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			this.quantity = 0;
		}
	}

	@Override
	public int getQuantity() {

		return this.quantity;
	}

	@Override
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "undefined";
		}

	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setCost(double cost) {
		if (cost > 0) {
			this.cost = cost;
		} else {
			this.cost = 0;
		}

	}

	@Override
	public double getCost() {
		return this.cost;
	}

	@Override
	public Category getCategory() {

		return super.category;
	}

	@Override
	public Container getContainer() {
		return this.hotDrinkContainer;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
