package org;

public class Hamburger implements FoodItem{
	double basePrice = 5.0;


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Hamburger";
	}

	@Override
	public double getBasePrice() {
		// TODO Auto-generated method stub
		return basePrice;
	}

}
