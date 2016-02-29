package com.datastruct.Mertix;

public class StackV {
	
	private final int SIZE = 10;
	private char[] lables;
	private int top;
	
	public StackV() {
		lables = new char[SIZE];
		top = -1;
	}
	
	public char pop(){
		return lables[top--];
	}
	public void push(char lable){
		lables[++top]=lable;
	}
	
	public char peek(){
		return lables[top];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}

}
