package com.leetcode;

import java.util.Stack;
/**
 * 使用堆栈（Stack）来模拟队列（FIFO）功能，要求数据必须存储在堆栈内部，需要实现enqueue（入队），dequeue（ 出队），
 * isEmpty（判空）三个功能，并给出单元测试。
 * @author huangxw
 *http://www.cnblogs.com/kaituorensheng/archive/2013/03/02/2939690.html
 * @param <T>
 * 利用堆栈的先进后出的特性，两个栈相互倒转就可以实现
 */

public class Stack2Quene  {
	
	public static void main(String[] args) {
		Stack2Quenue<Integer> q = new Stack2Quenue<Integer>();
		for(int i=0;i<8;i++){
			q.enQuenue(i);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(q.deQuenue());
		}
	}
	
	
}

class Stack2Quenue<T>{
	private  Stack<T> stackIn = new Stack<T>();
	private  Stack<T> stackOut = new Stack<T>();
	private int size=0;
	
	
	public Stack2Quenue() {
		this(10);
	}
	
	public Stack2Quenue(int size) {
		this.size = size;
	}


	public T enQuenue (T t){
		if(stackIn.size()<size){
			stackIn.push(t);
		}
		return t;
	}
	
	
	public T deQuenue0(){
		T t = null;
		
		if(stackOut.isEmpty()){
			while(!stackIn.isEmpty())
				stackOut.push(stackIn.pop());
		}
		if(stackOut.isEmpty())
			System.out.println("为空");
		else
			t=stackOut.pop();
		return t;
	}
	
	public T deQuenue(){
		T t = null;
		
		if(!stackOut.isEmpty()){
			t=stackOut.pop();
		}else{
			
			if(!stackIn.isEmpty()){
				if(stackOut.isEmpty()){
					while(!stackIn.isEmpty()){
						stackOut.push(stackIn.pop());
					}
					t=stackOut.pop();
				}
			}else {
				t=null;
			}
			
		}
		
		return t;
	}
	
	public boolean isEmpty(){
		
		return stackIn.isEmpty()&&stackOut.isEmpty();
	}
	

	
	
}
