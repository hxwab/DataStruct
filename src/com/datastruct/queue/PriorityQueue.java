package com.datastruct.queue;
/**
 * 优先级队列
 * 1.堆实现
 * 2.数组实现：插入的时候需要移动
 * @author csdc
 *
 */
public class PriorityQueue {

	private int nItem;//元素个数，待插入位置
	private int [] priorityQueue;
	private int maxSize;
	
	public PriorityQueue() {
		this(10);
	}
	public PriorityQueue(int size) {
		this.maxSize = size;
		priorityQueue = new int[maxSize];
		nItem=0;
	}
	
	public void insert(int num){
		if(nItem==0){
			priorityQueue[nItem++]=num;
		}else if(nItem<maxSize){
			
			//找到num合适的位置
			int index = nItem;
			while(priorityQueue[index-1]<num){
				priorityQueue[index]=priorityQueue[index-1];
				index--;
			}
			priorityQueue[index]=num;
			nItem++;
			
		}
	}
	
	
	public int peekMin(){
		return priorityQueue[nItem-1];
	}
	
	public  int remove(){
		return priorityQueue[--nItem];
	}
	
	public boolean isFull(){
		return nItem==maxSize;
	}
	
	public void display(){
		for(int i = nItem-1;i>=0;i--){
			System.out.println(priorityQueue[i]+"  ");
		}
		System.out.println();
	}
}
