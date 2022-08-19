package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<IItem> items = new ArrayList<>();

	public ShoppingCart() {
		super();
		this.items = items;
	}

	public List<IItem> getItems() {
		return items;
	}
	
	public void addItemToCart(IItem item) {
		items.add(item);
	}
	
	public double getTotalCartPrice() {
		double sum = 0;
		for(IItem i:items)
			sum+=i.getPrice();
		
		return sum;
	}
}