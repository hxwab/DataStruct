package com.trianning;

public class Get1InNum {
	
	
	public static void main(String[] args) {
		Get1InNum g = new Get1InNum();
		System.out.println(g.get1Num(4));
	}
	public int get1Num(int num){
		int count=0;
		while(num!=0){
			num = num&(num-1);
			count++;
		}
		return count;
		
	}

}
