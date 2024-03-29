package org;

public class Restaurant {	// main driver class
	public static void main(String[] args) {
		FoodItem hamburger = new Hamburger();
		hamburger = new Cheese(hamburger);
		
		hamburger = new Ketchup(hamburger);
		FoodItem hotdog = new Hotdog();
		hotdog = new Mustard(hotdog);
		
		Order order1 = new Order();
		order1.addOrderItem(hamburger);
		order1.addOrderItem(hotdog);

		LoyaltyStatus newMember = new LoyaltyStatus("New Member");
		Customer carson = new Customer("Carson", newMember);
		carson.finalizeOrder(order1);
	}

}
