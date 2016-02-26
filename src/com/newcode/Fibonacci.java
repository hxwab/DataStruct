package com.newcode;

public class Fibonacci {
	
	/**
	 * 递归层数太多
	 * @param n
	 * @return
	 */
	public int Fibonacci(int n) {
		if(n<=0){
			return 0;
		}else if(n==1||n==2){
        	return 1;
        }
        else {
        	return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
	
	/**
	 * 采用动态规划
	 * @param n
	 * @return
	 */
	public int Fibonacc(int n) {
		
		int [] f = new int [n];
		if(n<=0){
			return 0;
		}
		 if(n==1||n==2){
        	return 1;
        }
        else {
            f[0]=1;
            f[1]=1;
            for(int i=2;i<n;i++){
            	f[i]=f[i-1]+f[i-2];
            }
            return f[n-1];

        }
    }

}
