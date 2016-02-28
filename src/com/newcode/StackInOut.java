package com.newcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * @author csdc
 *
 *
 *思路：辅助栈每压入一个元素就跟出栈的序列相比较，相同则出栈序列index指针后移，同时被压入元素出栈。
 *入栈序列遍历完毕会出现两种情况，
 *1：辅助栈为空，说明出栈序列正确
 *2：辅助栈不为空，则说明还有元素没有出栈。每弹出一个元素就跟出栈序列index处元素比较，相同则后移，继续出栈比较。不同则返回false。最后栈为空则返回true
 *
 *1    2   3   4               1   2  3  5                  1   2   3  
 *  (push)     |- push (pop)             |-push (pop)               |-pop
 *
 *4    5   3   2   1           4  5    3  2  1             4  5   3  2  1 
 *|-index                         |-index                         |-index
 */
public class StackInOut {

	public static void main(String[] args) {
		boolean result =new StackInOut().isInOrder(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1});
		 result =new StackInOut().isInOrder(new int[]{1,2,3,4,5}, new int[]{4,3,5,2,1});
		
		System.out.println(result);
	}
	
	//有问题
	public boolean isInOrder(int [] pushA , int[] popB){
		if(pushA.length==0) return false; //要考虑为空的情况
		Stack<Integer> stack = new Stack<Integer>();
		int index =0;
		//遍历入栈序列
		for(int  item :pushA){
		    stack.push(item);//入栈
			if(item==popB[index]){//入栈元素出栈序列相比较，匹配则出栈，指针后移
				stack.pop();
				index++;
			}
		}
		
		while(!stack.isEmpty()){
			if(stack.peek()==popB[index]){//栈顶元素跟出栈序列相比较，匹配则出栈，指针后移
				stack.pop();
				index++;
			}else {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isInOrder1(int [] pushA , int[] popB){
		if(pushA.length==0) return false; //要考虑为空的情况
		Stack<Integer> stack = new Stack<Integer>();
		//遍历入栈序列,一次压入可以有多次淡出判断
		for(int i = 0,j = 0 ;i < pushA.length;){
            stack.push(pushA[i++]);
            while(j < pushA.length && stack.peek() == popB[j]){
                stack.pop();
                j++;
            }      
        }
        return stack.empty();
		
	}
	
	public boolean isInOrder2(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack();
        if( pushA.length == 0 && popA.length == 0 ) return true;
        for( int i=0,j=0; i < pushA.length; i++ ){
            stack.push( pushA[i] );
            while( ( !stack.empty() )&& ( stack.peek() == popA[j] ) ){
                stack.pop();
                j ++;
            } 
        }
         
        return stack.empty() ;
    }
}
