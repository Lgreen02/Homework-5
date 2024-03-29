package org;

import java.util.ArrayList;

public class Order {
	private ArrayList<FoodItem> orderItems = new ArrayList<>();
	
	
	public void addOrderItem(FoodItem foodItem) {
		orderItems.add(foodItem);
	}
	public double calculateTotal() {
		double totalCost = 0.0;
		for(FoodItem foodItem : orderItems)
			totalCost += foodItem.getBasePrice();
		return totalCost;
	}
	
	

}
