package com.taxcal.main;

import com.taxcal.count.ind.service.IndiaCountry;
import com.taxcal.count.ind.service.IndiaInvestment;
import com.taxcal.count.us.service.USCountry;
import com.taxcal.count.us.service.USInvestment;
import com.taxcal.generic.CalculateTax;
import com.taxcal.generic.CalculateTaximpl;
import com.taxcal.generic.Country;
import com.taxcal.generic.Investment;

public class ClientTest {

	public static void main(String arg[]) {
		
		//Ind Test Cases
		System.out.println("Test Cases for India");
		indTestCases();
		System.out.println();
		
		//US Test Cases
		System.out.println("Test Cases for US");
		usTestCases();
		
	}
	
	public static void indTestCases() {
		//Without InvestMent India
		Investment investment = new IndiaInvestment();
		CalculateTax calculate = new CalculateTaximpl();
		
		Country ind1 = new IndiaCountry(300000,investment,calculate);
		System.out.println(ind1.calTax());
		
		//With Investment
		IndiaInvestment investment1 =  new IndiaInvestment();
		try {
			investment1.setI80c(40000);
			investment1.setI80cc(80000);
			investment1.setI80d(20000);
			
			CalculateTax calculate1 = new CalculateTaximpl();
			
			Country ind2 = new IndiaCountry(1000000,investment1,calculate1);
			System.out.println(ind2.calTax());
		} catch (Exception e) {
			System.out.println("Investment Not allowd");
			e.printStackTrace();
		}
	}
	
	public static void usTestCases() {
		
		//Without InvestMent India
				Investment investment = new USInvestment();
				CalculateTax calculate = new CalculateTaximpl();
				
				Country us1 = new USCountry(9225,investment,calculate);
				System.out.println(us1.calTax());
				
		//With Investment
				USInvestment investment2 =  new USInvestment();
				investment2.setGovBond(200);
				investment2.setInsuranceBonds(100);
				investment2.setNationalSavins(100);
				
				CalculateTax calculate1 = new CalculateTaximpl();
				
				Country us2 = new USCountry(38701,investment,calculate1);
				System.out.println(us2.calTax());
	}
}
