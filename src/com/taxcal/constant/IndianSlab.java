package com.taxcal.constant;

public enum IndianSlab {

	SLAB1,SLAB2,SLAB3;
	
	public Double getIntrest() {
		
		switch(this){
			case SLAB1:
				return 0.0;
			case SLAB2:
				return 12.0;
			case SLAB3:
				return 20.0;
			default:
				return 0.0;
			
		}
		
	}
}
