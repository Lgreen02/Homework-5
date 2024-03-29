package org;

public class Ketchup extends FoodItemDecorator{

	public Ketchup(FoodItem foodItem) {
		super(foodItem);
	}
	@Override
	public double getBasePrice() {
		// TODO Auto-generated method stub
		return super.getBasePrice() + 1;
	}
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

}
