package com.restaurant.orders;

public class PayBill {

	// Set default value for class variables for double 0, for String undefined!

	private double moneyForPayment;

	// Constructors
	public PayBill(double moneyForPayment) {
		setMoneyForPayment(moneyForPayment);

	}

	// Getters and setters
	private void setMoneyForPayment(double moneyForPayment) {
		if (moneyForPayment > 0) {
			this.moneyForPayment = moneyForPayment;
		} else {
			this.moneyForPayment = 0;
		}
	}

	// Public methods
	public double payableAmount(PlaceOrder order) {
		return order.getOrdersPrice();
	}

	public void payBill(PlaceOrder order) {
		if (order.getOrdersPrice() > this.moneyForPayment) {
			System.out.println("You don't have enough money! ");
		} else {
			double change = this.moneyForPayment - order.getOrdersPrice();
			System.out.printf("Your bill was %.2f \n Your change is %.2f", order.getOrdersPrice(), change);
		}
	}
}
