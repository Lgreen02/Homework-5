package org;

public class Fries implements FoodItem {
	double basePrice = 4.25;


	@Override
	public double getBasePrice() {
		// TODO Auto-generated method stub
		return basePrice;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Fries";
	}

}
