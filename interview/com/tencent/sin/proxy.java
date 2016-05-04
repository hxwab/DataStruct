package com.tencent.sin;

import java.util.List;

public class proxy implements ISinIN {
	
	private  ISinIN sinIN ;
	private int premission;
	private static final int ALLOW = 1;

	public proxy() {
		sinIN = new SinIN();
	}

	@Override
	public void sinIN(Employee e) {
		sinIN.sinIN(e);
		premission=e.getPremission();
	}

	@Override
	public List<Employee> getLastNById(int n) {
		List<Employee> result=null;
		if(premission==ALLOW){
			 result= sinIN.getLastNById(n);
		}
		return result;
	}

	@Override
	public List<Employee> getLastNBySinTime(int n) {
		List<Employee> result=null;
		if(premission==ALLOW){
			 result= sinIN.getLastNBySinTime(n);
		}
		return result;
	}

}
