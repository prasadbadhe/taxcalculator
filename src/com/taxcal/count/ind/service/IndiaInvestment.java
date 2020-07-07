package com.taxcal.count.ind.service;

import com.taxcal.generic.Investment;

public class IndiaInvestment implements Investment{

	private double i80cc;
	private double i80d;
	private double i80c;
	
	public double getI80cc() {
		return i80cc;
	}
	public void setI80cc(double i80cc) throws Exception {
		if(i80cc>100000) {
			throw new Exception("80cc allow only 1 lak");
		}
		this.i80cc = i80cc;
	}
	public double getI80d() {
		return i80d;
	}
	public void setI80d(double i80d) throws Exception {
		if(i80d>25000) {
			throw new Exception("80d allow only 25 thousend");
		}
		this.i80d = i80d;
	}
	public double getI80c() {
		return i80c;
	}
	public void setI80c(double i80c) throws Exception {
		if(i80c>50000) {
			throw new Exception("80c allow only 50 thousend");
		}
		this.i80c = i80c;
	}
	
	@Override
	public double getTotalInvestment() {
		return i80cc+i80d+i80c;
	}
	

}
