package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 两个 队列实现一个栈
 * @author huangxw
 *http://www.cnblogs.com/kaituorensheng/archive/2013/03/02/2939690.html
 *来回倒
 */
public class Queue2Stack {
	

	public static void main(String[] args) {
		Queue2Stack qu= new  Queue2Stack();
		Quenue2Stack  q = qu.new Quenue2Stack();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q.pop());
	}
	

	private class Quenue2Stack{
		
		LinkedList<Integer> qin = new LinkedList<Integer>();
		LinkedList<Integer> qout = new LinkedList<Integer>();
		
		public void push(int node){
			qin.add(node);
		}
		
		
		public int pop(){
			int pop;
			int size = qin.size();
			for(int i=0;i<size-1;i++){
				qout.add(qin.pop());
			}
			pop = qin.pop();
			
			for(int i=0;i<qout.size();i++){
				qin.add(qout.pop());
			}
			return pop;
		}
		
		
		
	}
}
