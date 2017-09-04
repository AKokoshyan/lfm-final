package com.restaurant.items;

import com.restaurant.items.container.Container;

public abstract class Item implements Container {

	public enum Category {
		DESERT, SNACKS, MAINCOURSE, DRINKS, STARTER;
	}

	protected final Category category;
	protected String name;
	protected double cost;
	protected int quantity;

	// Constructors
	protected Item(Category category, String name, double cost, int quantity) {
		this.category = category;
		setName(name);
		setCost(cost);
		setQuantity(quantity);
	}

	// Setters and getters

	public abstract void setQuantity(int quantity);

	public abstract int getQuantity();

	public abstract void setName(String name);

	public abstract String getName();

	public abstract void setCost(double cost);

	public abstract double getCost();

	public abstract Category getCategory();

	public abstract Container getContainer();

}
