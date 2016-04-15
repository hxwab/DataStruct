package com.tencent.sin;

import java.util.List;

public interface ISinIN {
	
	public void sinIN(Employee e);
	
	public List<Employee> getLastNById(int n);
	
	public List<Employee> getLastNBySinTime(int n);

}
