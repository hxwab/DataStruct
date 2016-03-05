package com.newcode.netase;

import java.util.Scanner;

public class Main {
	
	private  int [] a;
	int c;
	
	public static void main(String[] args) {
		System.out.printf(0+"X");  
		 new Main();
		
	}
	
	public Main() {
		Scanner sc = new Scanner(System.in);
		
			String str = sc.nextLine();
			String [] s = str.split(" ");
			a = new int [Integer.parseInt(s[0])];
			c = Integer.parseInt(s[1]);
			
			str = sc.nextLine();
			s=str.split(" ");
			for(int i=0;i<a.length;i++){
				a[i]=Integer.parseInt(s[i]);
			}
			
			System.out.println(get(a, c));
		
		
	}
	
	
	
     public   int  get(int [] a, int c){
    	 
    	 for(int n :a){
    		 if(c>=n){
    			 c+=n;
    		 }else{
    			 c+=getpublic(c, n);
    		 }
    	 }
    	 return c;
     }
     
     public int getpublic(int m,int n){
    	 
    	 if(m%n==0) return n;
    	 
    	 return  getpublic(n, m%n);
    	 
     }
}
