package com.trianning.oj;

import java.util.*;

public class GetLastLength {
	

	public static void main(String[] args) {
		new GetLastLength().get();
	}
	
	public void get(){
		
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			
			String str = sc.nextLine();//会造成阻塞
			String s = sc.nextLine();
			System.out.println(s);
			String [] ss = str.split(" ");
			System.out.println(ss[ss.length-1].length());
		}
		
	 
	}

}
