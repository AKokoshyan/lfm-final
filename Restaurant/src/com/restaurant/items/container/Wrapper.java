package com.restaurant.items.container;

public class Wrapper implements Container {
	// Set default value for class variables for String undefined!

	private String wrappingMaterial;

	// Constructors
	public Wrapper(String wrappingMaterial) {
		setWrappingMaterial(wrappingMaterial);
	}

	// Getters and setters
	private void setWrappingMaterial(String wrappingMaterial) {
		if ((wrappingMaterial != null) && (wrappingMaterial.toLowerCase().trim().equals("box")
				|| wrappingMaterial.toLowerCase().trim().equals("plastic box")
				|| wrappingMaterial.toLowerCase().trim().equals("napkin"))) {
			this.wrappingMaterial = wrappingMaterial;
		} else {
			this.wrappingMaterial = "undefined";
		}

	}

	@Override
	public String packagingMaterials() {
		return this.wrappingMaterial;
	}

}
