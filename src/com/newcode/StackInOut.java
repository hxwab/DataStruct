package com.newcode;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * @author csdc
 *
 */
public class StackInOut {

	public static void main(String[] args) {
		boolean result =new StackInOut().isInOrder(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1});
		 result =new StackInOut().isInOrder(new int[]{1,2,3,4,5}, new int[]{4,3,5,2,1});
		
		System.out.println(result);
	}
	
	public boolean isInOrder(int [] pushA , int[] popB){
		if(pushA.length==0) return false; //要考虑为空的情况
		Stack<Integer> stack = new Stack<Integer>();
		int index =0;
		for(int  item :pushA){
		    stack.push(item);
			if(item==popB[index]){
				stack.pop();
				index++;
			}
		}
		
		while(!stack.isEmpty()){
			if(stack.peek()==popB[index]){
				stack.pop();
				index++;
			}else {
				return false;
			}
		}
		
		return true;
	}
}
