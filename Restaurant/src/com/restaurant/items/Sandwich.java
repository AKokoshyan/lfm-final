package com.restaurant.items;

import com.restaurant.items.container.Container;
import com.restaurant.items.container.Cup;
import com.restaurant.items.container.Wrapper;

public abstract class Sandwich extends Item {

	protected Container sandwichContainer;

	public Sandwich(String name, double cost, int quantity) {
		super(Category.SNACKS, name, cost, quantity);
		setRandomContainer(Container.generateContainer);
	}

	private void setRandomContainer(int generateContainer) {
		switch (generateContainer) {
		case 0:
			this.sandwichContainer = new Wrapper("box");
			break;
		case 1:
			this.sandwichContainer = new Wrapper("plastic box");
			break;
		case 2:
			this.sandwichContainer = new Wrapper("napkin");
			break;
		default:
			break;
		}

	}

	@Override
	public String toString() {

		return this.category + " " + this.name + " in " + this.sandwichContainer.packagingMaterials() + " "
				+ this.quantity + " " + this.cost;
	}
}
