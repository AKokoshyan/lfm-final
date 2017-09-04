package com.restaurant.items.container;

public class Glass implements Container {

	// Set default value for class variables for String undefined!

	private String glass;

	// Constructors
	public Glass(String glassMaterial) {
		setGlassMaterial(glassMaterial);
	}

	// Getters and setters
	private void setGlassMaterial(String glass) {
		if ((glass != null) && (glass.toLowerCase().trim().equals("plastic glass")
				|| glass.toLowerCase().trim().equals("standard glass")
				|| glass.toLowerCase().trim().equals("glass for wine"))) {
			this.glass = glass;
		} else {
			this.glass = "undefined";
		}

	}

	@Override
	public String packagingMaterials() {
		return this.glass;
	}

	@Override
	public String toString() {
		return this.glass;
	}
}
