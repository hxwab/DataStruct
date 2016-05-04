package com.tencent.sin;

import java.util.Date;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		ISinIN sin = new proxy();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			String  msg = sc.nextLine();
			String[] ss = msg.split(" ");
			Employee e = new Employee(ss[0], ss[1],  Integer.parseInt(ss[2]), new Date());
			sin.sinIN(e);
			
			
		}
	}

}
