package com.leetcode;



public class MinStack {

    int [] stack = new int [20];
    int min = Integer.MAX_VALUE;
    int top = -1;
    int []m = new int[20];
    
    public void push(int node) {
        if(top<20){
            stack[++top]=node;
        }
        if(node<min){
            min=node;
        }
        m[top]=min;
    }
    
    public void pop() {
        if(top>=0){
            stack[top--]=0;
        }
    }
    
    public int top() {
        return stack[top];
    }
    
    public int min() {
        return m[top];
    }
}
