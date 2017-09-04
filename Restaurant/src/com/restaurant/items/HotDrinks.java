package com.restaurant.items;

import java.util.Random;

import com.restaurant.items.container.Container;
import com.restaurant.items.container.Cup;

public abstract class HotDrinks extends Item {

	protected Container hotDrinkContainer;

	public HotDrinks(String name, double cost, int quantity) {
		super(Category.DRINKS, name, cost, quantity);
		setRandomCupContainer(Container.generateContainer);
	}

	private void setRandomCupContainer(int generateContainer) {
		switch (generateContainer) {
		case 0:
			this.hotDrinkContainer = new Cup("porcelan cup");
			break;
		case 1:
			this.hotDrinkContainer = new Cup("plastic cup");
			break;
		case 2:
			this.hotDrinkContainer = new Cup("cup with hatch");
			break;
		default:
			break;
		}

	}

	@Override
	public String toString() {

		return this.category + " " + this.name + " in " + this.hotDrinkContainer + " " + this.quantity + " "
				+ this.cost;
	}

}
