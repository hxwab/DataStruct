package com.tencent.sin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 腾讯每天上班有员工和主管签到。主管有权限查看签到情况，可以获取的信息有：总共有多少人签到，按照员工的id或者签到顺序查看员工的签到情况，得到倒数n个签到的员工。
要求：1）使用oo设计
2）排序的时间复杂度为O（nlogn)， 最差的时间复杂度也不能达到O（n^2)
 * @author csdc
 *http://www.nowcoder.com/discuss/4631?type=0&order=0&pos=21&page=3
 */
public class SinIN  implements ISinIN{

	private List<Employee> employees = new ArrayList<Employee>();
	
	
	@Override
	public void sinIN(Employee e) {
		employees.add(e);
	}



	@Override
	public List<Employee> getLastNById(int n) {
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getId().compareTo(o2.getId());
			}
			
		});
		return employees;
	}

	@Override
	public List<Employee> getLastNBySinTime(int n) {
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getDate().compareTo(o2.getDate());
			}
			
		});
		return employees;
	}
	
	
	
	
	
	

}


