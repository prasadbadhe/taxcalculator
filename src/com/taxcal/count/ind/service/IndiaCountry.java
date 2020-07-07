package com.taxcal.count.ind.service;

import com.taxcal.constant.IndianSlab;
import com.taxcal.generic.CalculateTax;
import com.taxcal.generic.Country;
import com.taxcal.generic.Investment;


public class IndiaCountry implements Country{

	private double amount;
	
	private Investment investment;
	
	private CalculateTax calculate;
	
	public IndiaCountry(double amount, Investment investment, CalculateTax calculate){
		this.amount = amount;
		this.investment = investment;
		this.calculate = calculate;
	}
	
	private IndianSlab getIntSlab() {
		
		if(amount<=350000) {
			return IndianSlab.SLAB1;
		}else if(amount>=350001 && amount<=500000) {
			return IndianSlab.SLAB2;
		}else {
			return IndianSlab.SLAB3;
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
