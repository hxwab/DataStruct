package com.newcode.digui;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author csdc
 *p[n]=sum(p[n-1],.....p[1],p[0]) =  2*p[n-1]
 */
public class ForgJumpII {

	
	public static void main(String[] args) {
		System.out.println(new ForgJumpII().JumpFloor(1));
		System.out.println(new ForgJumpII().jumpFloor(4));
	}
	/**
	 * p[n]=sum(p[n-1],.....p[1],p[0]) =  2*p[n-1]
	 * @param target
	 * @return
	 * 动态规划
	 */
	 public int JumpFloor(int target){
		 int  [] p = new int [target+1];
		 if(target==1) return 1;
		 if(target==2) return 2;
		
		 p[0] = 1;
		 p[1] = 1;
		 p[2] = 2;
			 
		 for(int i=3;i<target+1;i++){
			 int index =i;
			 while(index-->0){
				 p[i]+=p[index];
			 }
		 }
		 
		 return p[target];
	 }
	 
	 /**
	  * 递归
	  * @param target
	  * @return
	  *通项 y = 2^n
	  */
	 public int jumpFloor(int target){
		 if(target==1) return 1;
		 return 2*jumpFloor(target-1);
	 }
}
