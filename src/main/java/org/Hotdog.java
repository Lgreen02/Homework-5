package org;

public class Hotdog implements FoodItem {
	double basePrice = 3.0;


	@Override
	public double getBasePrice() {
		// TODO Auto-generated method stub
		return basePrice;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Hot Dog";
	}

}
