package org;

public class LoyaltyStatus {
	public String statusName;
	
	public LoyaltyStatus(String statusName) {
		this.statusName = statusName;
	}
	
	public double applyDiscount(double totalCost) {
		
		switch(statusName) {
		case "New Member":
			totalCost *= 0.75;
			break;
		case "Valued Member":
			totalCost *= 0.7;
			break;
		case "Big Spender":
			totalCost *= 0.5;
			break;
		}
		return totalCost;
	}

}
