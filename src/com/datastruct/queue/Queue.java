package com.datastruct.queue;

import java.lang.reflect.Array;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;



/**
 * 增加了nItems来表明元素个数，进而简化判断队列为空或溢出
 * @author huangxw
 *
 */
public class Queue <T> {
	
	private Class<T> type;
	private int MAX_SIZE;
	private T[] queue;
	private int front;//队头指针（指向待移除的位置）
	private int rear;//队尾指针（指向待插入位置的前一个位置）
	private int nItems;//队中元素个数
	
	

	@SuppressWarnings("unchecked")
	public Queue(int size) {
		MAX_SIZE=size;
		queue =(T[]) new Object[MAX_SIZE];
		front = 0;
		rear=-1;
		nItems=0;
		
	}
	
	/**
	 * 插入队尾，若到了数组末尾，则要判断是否溢出，若未溢出则将队尾指针置为-1
	 * @param item
	 * @throws Exception 
	 */
	public void insert(T item) throws Exception{
		
		if(!isFull()){
			
			if(rear==MAX_SIZE-1){
				rear=-1;
			}
			queue[++rear]=item;
			nItems++;
			System.out.println(front+"*****"+rear+"*****");
		}else {
			
			throw new Exception("溢出");
		}
		
		
	}
	
	/**
	 * 取得队头元素，队头指针后移，nItems--;
	 * @return
	 */
	public T remove(){
		
			T temp =queue[front++];
			if(front==MAX_SIZE){
				front=0;
			}
			nItems--;
			return temp;
	}
	
	public T peek(){
		
			return queue[front];
		
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public boolean isFull(){

		return nItems==MAX_SIZE;
	}
	
	public int size(){
		return nItems;
	}
	
	
}



class Queue1{
    private final int SIZE=20;
    private int[] queArray;
    private int front;
    private int rear;
    public Queue1(){
        queArray=new int[SIZE];
        front=0;
        rear=-1;
    }
    public void insert(int j){
        if(rear==SIZE-1)
            rear=-1;
        queArray[++rear]=j;
    }
    public int remove(){
        int temp=queArray[front++];
        if(front==SIZE)
            front=0;
        return temp;
    }
    public boolean isEmpty(){
        return ((rear+1==front)||(front+SIZE-1==rear));
    }
}
	
class Queue2{
	
	  private final int SIZE=20;//最后一个空间空出来
	    private int[] queArray;
	    private int front;//指向队首位置
	    private int rear;//指向队尾位置的下一个位置（待插入位置）
	    public Queue2(){
	        queArray=new int[SIZE];
	        front=0;
	        rear=0;
	    }
	    public void insert(int j){
	        if(rear==SIZE-1)
	            rear=0;

	        queArray[rear++]=j; //需注意该操作与指向带插入位置前一个位置的区别
	    }
	    public int remove(){
	        int temp=queArray[front++];
	        if(front==SIZE)
	            front=0;
	        return temp;
	    }
	    public boolean isEmpty(){
	        return rear==front;
	    }
	    
	    public boolean isFull(){
	    	
	    	return (rear+1)%SIZE==front;
	    }
	
}
