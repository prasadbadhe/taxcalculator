package com.taxcal.constant;

public enum USSlab {
	
	SLAB1,SLAB2,SLAB3,SLAB4;
	
	public Double getIntrest() {
		
		switch(this){
			case SLAB1:
				return 10.0;
			case SLAB2:
				return 12.0;
			case SLAB3:
				return 22.0;
			case SLAB4:
				return 24.0;
			default:
				return 0.0;
			
		}
		
	}
}