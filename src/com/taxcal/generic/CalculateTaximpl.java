package com.taxcal.generic;

public class CalculateTaximpl implements CalculateTax{

	@Override
	public double calculateTax(double amount,double interest) {
		
		double taxableAmount = (amount * (interest/100));
		
		return taxableAmount;
	}

}
