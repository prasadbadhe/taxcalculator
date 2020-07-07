package com.taxcal.count.us.service;

import com.taxcal.generic.Investment;

public class USInvestment implements Investment{
	
	private double govBond;
	
	private double nationalSavins;
	
	private double insuranceBonds;

	public double getGovBond() {
		return govBond;
	}

	public void setGovBond(double govBond) {
		this.govBond = govBond;
	}

	public double getNationalSavins() {
		return nationalSavins;
	}

	public void setNationalSavins(double nationalSavins) {
		this.nationalSavins = nationalSavins;
	}

	public double getInsuranceBonds() {
		return insuranceBonds;
	}

	public void setInsuranceBonds(double insuranceBonds) {
		this.insuranceBonds = insuranceBonds;
	}

	@Override
	public double getTotalInvestment() {
		
		return govBond+nationalSavins+insuranceBonds;
	}
	
		
}
