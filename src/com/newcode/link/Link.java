package com.newcode.link;

public class Link {
	
	private Node head;
	
	/**
	 * 插入到链表头部
	 * @param value
	 * @return
	 */
	public Node insert (int value){
		head = new Node(value, head);
		return head;
	}
	
	/**
	 * 插入到最后
	 * @param value
	 * @return
	 */
	public Node insertLast(int value){
		Node node = new Node(value);
		Node last = getLastNode();
		last.next=node;
		return head;
		
	}
	
	/**
	 * 获取头节点
	 * @return
	 */
	public Node getFirstNode(){
		return head;
	}
	
	/**
	 * 获取尾节点
	 * @return
	 */
	public Node getLastNode(){
		if(head==null) return null;
		
		Node last = head;
		while(last.next!=null){
			last =last.next;
		}
		
		return last;
	}
	
	/**
	 * 删除链表
	 * @param value
	 * @return
	 */
	public Node delete(int value){
		Node pre= head;
		Node curr = head;
		
		while(curr!=null){
			if(curr.vaule==value) break;
			pre = curr;
			curr = curr.next;
		}
		
		if(curr==null) return null;
		
		pre.next=curr.next;
		
		return curr;
	}
	
	/**
	 * 打印链表
	 */
	public void display(){
		Node curr = head;
		while(curr!=null){
			System.out.print(curr.vaule + " ");
			curr=curr.next;
		}
	}
	
	 static class Node{
		 
		 int vaule;
		 Node next;
		 
		 public Node(int value) {
			 this(value,null);
		}
		 
		 public Node(int value ,Node node) {
			 this.vaule =value;
			 this.next=node;
		}
	 }

}
