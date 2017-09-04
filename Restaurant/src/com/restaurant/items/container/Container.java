package com.restaurant.items.container;

import java.util.Random;

public interface Container {
	int generateContainer = new Random().nextInt(3) + 0;

	String packagingMaterials();
}
