package com.restaurant.menu;

import java.util.ArrayList;
import java.util.Iterator;

import com.restaurant.items.Item;

public class Menu {

	private ArrayList<Item> itemsInMenu;

	public Menu() {
		itemsInMenu = new ArrayList<>();
	}

	public void addItem(Item item) {
		if (item != null) {
			itemsInMenu.add(item);
		} else {
			System.out.println("The item you are trying to put in the menu is not existing!");
		}
	}

	public void displayItems() {
		for (Item item : itemsInMenu) {
			System.out.println(item.toString());
		}
	}

	public ArrayList<Item> getItems() {
		return itemsInMenu;
	}

	public void removeItem(Item item) {
		if (item != null) {
			itemsInMenu.remove(item);
		}
	}
}
