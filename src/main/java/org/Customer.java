package org;
import java.text.DecimalFormat;
public class Customer {
	String name;
	LoyaltyStatus loyaltyStatus;
	private double totalCost;
	
	public Customer(String name, LoyaltyStatus loyaltyStatus) {
		this.name = name;
		this.loyaltyStatus = loyaltyStatus;
	}
	
	public void finalizeOrder(Order order) {
		
		totalCost = loyaltyStatus.applyDiscount(order.calculateTotal());
		DecimalFormat moneyFormat = new DecimalFormat("0.00");
		String formattedTotal = moneyFormat.format(totalCost);
		
		System.out.println(name + " made an order that costs " + formattedTotal);
	}
	

}
