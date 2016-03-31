package com.newcode.digui;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author csdc
 *此题还可以应用到找出特定值的所有二叉树的路径
 */
public class ForgJump {

	static int num;

	public static void main(String[] args) {
		new ForgJump().findWays(5);
		System.out.println(num);
		System.out.println(new ForgJump().JumpFloors(5));
		System.out.println(new ForgJump().jumpFloor(5));

	}
	
	public void findWays(int n){
		if(n==0){
			num++;
			return ;
		}
		
		if(n<0) return ;
		
		findWays(n-1);
		findWays(n-2);
		
	}
	
	
	 public int JumpFloor(int target) {
		 int num=0;
		 if(target==0){
			 num++;
			 return num;
		 }
		 
		 if(target<0) return 0;
		 
		num+= JumpFloor(target-1);
		num+=JumpFloor(target-2);
		 
		 return num;
	    }
	 
	 public int JumpFloors(int target) {
		
		 if(target==0){
			 return 1;
		 }
		 
		 if(target<0) return 0;
		 
		 return JumpFloor(target-1)+JumpFloor(target-2);
	    }
	 
	 
	 
	 /**************以下为其他人的方法*************/
	 
	 /*对于第n个台阶来说，只能从n-1或者n-2的台阶跳上来，所以
	 F(n) = F(n-1) + F(n-2)
			 斐波拉契数序列，初始条件
			 n=1:只能一种方法
			 n=2:两种
	  /***
	   * 实际上就是斐波那契数列
	   * @param number
	   * @return
	   */
	public  int jumpFloor(int number) {
	        if(number <= 0)
	            return 0;
	        else if(number == 1)
	            return 1;
	        else if(number == 2)
	            return 2;
	        else
	            return jumpFloor(number-1) + jumpFloor(number-2);
	    }
	
	//采用动态规划
	
	public int jumpFloors(int number) {
	    int []  a = new int [number+1];
	    a[0]=1;
	    a[1] =1;
	    for(int i=2;i<number+1;i++)
	    {
	        a[i]=a[i-1]+a[i-2];  
	    }
	    return a[number];
	    }
}
