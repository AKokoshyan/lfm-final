package com.restaurant.items.container;

public class Cup implements Container {

	// Set default value for class variables for String undefined!

	private String cup;

	// Constructors
	public Cup(String cup) {
		setCupMaterial(cup);
	}

	// Getters and setters
	private void setCupMaterial(String cup) {
		if ((cup != null)
				&& (cup.toLowerCase().trim().equals("porcelan cup") || cup.toLowerCase().trim().equals("plastic cup")
						|| cup.toLowerCase().trim().equals("cup with hatch"))) {
			this.cup = cup;
		} else {
			this.cup = "undefined";
		}

	}

	@Override
	public String packagingMaterials() {
		return this.cup;
	}

}
