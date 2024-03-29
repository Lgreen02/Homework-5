package org;

public abstract class FoodItemDecorator implements FoodItem {
	
	protected FoodItem decoratedFoodItem;
	
	public FoodItemDecorator(FoodItem foodItem) {
		this.decoratedFoodItem = foodItem;
	}
	
	@Override
	public double getBasePrice() {
		// TODO Auto-generated method stub
		return this.decoratedFoodItem.getBasePrice();
	}
	


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.decoratedFoodItem.getName();
	}

}
