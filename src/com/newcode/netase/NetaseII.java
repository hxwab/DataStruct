package com.newcode.netase;

import java.io.ObjectInputStream.GetField;

public class NetaseII {

	
	public static void main(String[] args) {
		System.out.println(new NetaseII().gethurt(new int[]{-3,7}, new int[]{5,-4}, new int[]{2,13},new int[]{4,0}, 23));
	}
	
	public int  gethurt(int[] a ,int [] b,int[] c,int[] d,int r){
		
		double d1,d2,d3;
		int hurt =0;
		
		
		d1 = getDistance(a, d);
		d2= getDistance(b, d);
		d3 = getDistance(c, d);
		
		if(d1<=r)
			hurt++;
		if(d2<=r)
			hurt++;
		if(d3<=r)
			hurt++;
			
		return hurt;
		
		
	}
	
	public double  getDistance(int[] m,int []n){
		return  Math.sqrt((m[0]-n[0])*(m[0]-n[0])+(m[1]-n[1])*(m[1]-n[1]) +0.0);
	}
}
