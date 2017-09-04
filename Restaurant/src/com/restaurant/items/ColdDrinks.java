package com.restaurant.items;

import com.restaurant.items.container.Container;
import com.restaurant.items.container.Cup;
import com.restaurant.items.container.Glass;

public abstract class ColdDrinks extends Item {

	protected Container coldDrinkContainer;

	public ColdDrinks(String name, double cost, int quantity) {
		super(Category.DRINKS, name, cost, quantity);
		setRandomGlassContainer(Container.generateContainer);
	}

	private void setRandomGlassContainer(int generateContainer) {
		switch (generateContainer) {
		case 0:
			this.coldDrinkContainer = new Glass("plastic glass");
			break;
		case 1:
			this.coldDrinkContainer = new Glass("standard glass");
			break;
		case 2:
			this.coldDrinkContainer = new Glass("glass for wine");
			break;
		default:
			break;
		}

	}

	@Override
	public String toString() {
		return this.category + " " + this.name + " in " + this.coldDrinkContainer.packagingMaterials() + " "
				+ this.quantity + " " + this.cost;
	}
}
