package com.taxcal.count.us.service;

import com.taxcal.constant.USSlab;
import com.taxcal.generic.CalculateTax;
import com.taxcal.generic.Country;
import com.taxcal.generic.Investment;

public class USCountry implements Country{

	private double amount;
	
	private Investment investment;
	
	private CalculateTax calculate;
	
	public USCountry(double amount, Investment investment, CalculateTax calculate){
		this.amount = amount;
		this.investment = investment;
		this.calculate = calculate;
	}
	
	private USSlab getIntSlab() {
		
		if(amount<=9525) {
			return USSlab.SLAB1;
		}else if(amount>=9526 && amount<=38700) {
			return USSlab.SLAB2;
		}else if(amount>=38701 && amount<=82500){
			return USSlab.SLAB3;
		}else {
			return USSlab.SLAB4;
		}
	}
	
	private double getTaxableAmount(double amount, Investment investment) {
		
		return (amount - investment.getTotalInvestment());
	}
	
	@Override
	public double calTax() {
		return calculate.calculateTax(this.getTaxableAmount(amount,investment), this.getIntSlab().getIntrest());
		
	}

}
