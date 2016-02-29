package com.datastruct.queue;

public class TestQueue {
	
	public static void main(String[] args) {
		TestQueue t = new TestQueue();
		try {
			t.Testqueue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Testqueue() throws Exception{
		Queue q = new Queue(5);

		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.insert(6);
		
		q.remove();
		q.insert(7);
		
		while(!q.isEmpty()){
			System.out.println(q.remove());

		}
	}
}
