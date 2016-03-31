package com.trianning;

/**
 * 题目描述
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * @author admin
 *
 */
public class MutliplyArray {
	
	public static void main(String[] args) {
		MutliplyArray m =new MutliplyArray();
		m.dispaly(m.mut(new int[]{1,2,3,4,5}));
	}
	
	
	
	public int[] mut(int [] A){
		
		int length = A.length;
		int [] B = new int [length];
		
		for(int i=0,tmp=1;i<length;tmp*=A[i++]) B[i]=tmp;
		for(int i=length-1,tmp=1;i>=0;tmp*=A[i--]) B[i]*=tmp;
		return B;
		
	}
	
	public int [] mutil(int[] A){
		
		int length =A.length;
		int[] before= new int[length]; //存储该元素之前所有元素的乘积
		int[] after = new int [length];//存储该元素之后所有元素的乘积
		int [] B = new int [length];
		before[0]=1;
		after[length-1]=1;
		
		for(int i=1;i<length;i++){
			before[i]=before[i-1]*A[i-1];
		}
		
		for(int i=length-2;i>=0;i--){
			after[i]=after[i+1]*A[i+1];
		}
		
		for(int i=0;i<length;i++){
			B[i]=before[i]*after[i];
		}
		
		return B;
	}
	
	public void dispaly(int []a){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] +" ");
		System.out.println();
	}
   
}
