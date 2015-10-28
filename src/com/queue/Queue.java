package com.queue;

import java.lang.reflect.Array;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;



/**
 * ������nItems������Ԫ�ظ������������ж϶���Ϊ�ջ����
 * @author huangxw
 *
 */
public class Queue <T> {
	
	private Class<T> type;
	private int MAX_SIZE;
	private T[] queue;
	private int front;//��ͷָ�루ָ����Ƴ���λ�ã�
	private int rear;//��βָ�루ָ�������λ�õ�ǰһ��λ�ã�
	private int nItems;//����Ԫ�ظ���
	
	

	@SuppressWarnings("unchecked")
	public Queue(int size) {
		MAX_SIZE=size;
		queue =(T[]) new Object[MAX_SIZE];
		front = 0;
		rear=-1;
		nItems=0;
		
	}
	
	/**
	 * �����β������������ĩβ����Ҫ�ж��Ƿ��������δ����򽫶�βָ����Ϊ-1
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
			
			throw new Exception("���");
		}
		
		
	}
	
	/**
	 * ȡ�ö�ͷԪ�أ���ͷָ����ƣ�nItems--;
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
	
	  private final int SIZE=20;//���һ���ռ�ճ���
	    private int[] queArray;
	    private int front;//ָ�����λ��
	    private int rear;//ָ���βλ�õ���һ��λ�ã�������λ�ã�
	    public Queue2(){
	        queArray=new int[SIZE];
	        front=0;
	        rear=0;
	    }
	    public void insert(int j){
	        if(rear==SIZE-1)
	            rear=0;
	        queArray[rear++]=j; //��ע��ò�����ָ�������λ��ǰһ��λ�õ�����
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
