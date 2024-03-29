package org;

public class Mustard extends FoodItemDecorator{

	public Mustard(FoodItem foodItem) {
		super(foodItem);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getBasePrice() {
		// TODO Auto-generated method stub
		return super.getBasePrice() + 0.75;
	}
	


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

}
