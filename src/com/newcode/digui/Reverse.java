package com.newcode.digui;
/**
 * 给一个int输入，要求输出其反向字符串（采用递归，且不能有全局变量）
 * 输入 int 123 ,输出 string 321
 * @author csdc
 *
 *
 */
public class Reverse {

	public static String str="";
	
	public static void main(String[] args) {
		System.out.println(new Reverse().JumpFloor(12345));
		String s ="";
		System.out.println(s.length());
		System.out.println(s.hashCode());
		System.out.println(s==null);
		int x=20,y=5;
		System.out.println(x+y +""+(x+y)+y); 
		new Reverse().reveser(12345);
		System.out.println(str);
		System.out.println(new Reverse().reverse(12345));
	}
	
	/**
	 * 局部变量
	 * @param target
	 * @return
	 */
	public String JumpFloor(int target) {
		
		String str = null;
		if(target==0) return "";
        str =String.valueOf(target%10);	
        
		str+=JumpFloor(target/10);
		 
		 return str;
	    }
	
	
	/**
	 *  最简洁的方式
	 * @param target
	 * @return
	 */
	public String reverse(int target) {
		if(target==0) return "";
		return String.valueOf(target%10)+reverse(target/10);
	    }
	
	/**
	 * 全局变量
	 * @param target
	 */
	public void reveser(int target) {
		
		if(target==0) return ;
        str +=String.valueOf(target%10);	
        reveser(target/10);
	    }
}
