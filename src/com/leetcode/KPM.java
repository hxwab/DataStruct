package com.leetcode;

public class KPM {
	
	
	public void getNext(String p , int[] next){
		
		int length = p.length();
		int j =0;
		int k=-1;
		
		while(j<length){
			
			if(p.charAt(j)==p.charAt(k)){
				j++;
				k++;
				next[j]=k;
				
			}else{
				k=next[k];
			}
			
		}
		
		
	}

}
