package org;

public class Cheese extends FoodItemDecorator{

	public Cheese(FoodItem foodItem) {
		super(foodItem);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getBasePrice() {
		// TODO Auto-generated method stub
		return super.getBasePrice() + 2.75;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	
}
