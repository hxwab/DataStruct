package com.newcode.link;

import com.newcode.link.LinkList.Node;


public abstract class AbstractLink {

	
	protected Node head;
	
	public abstract void insert(int val);
	
	public abstract void delete(int val);
	
	
	/**
	 * 返回当前节点和前驱
	 * @param val
	 * @return
	 */
	public Node[] findNode(int val){
		Node pre= null;
		Node curr = head;
		
		while(curr!=null){
			if(curr.vaule==val) break;
			pre = curr;
			curr = curr.next;
		}
		
		if(curr==null) return null;
		if(pre==null) return new Node[]{null,curr};
		
		return new Node[]{pre,curr};
		
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
	 * 打印链表
	 */
	public void display(LinkList.Node head){
		Node curr = head;
		while(curr!=null){
			System.out.print(curr.vaule + " ");
			curr=curr.next;
		}
		System.out.println();
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
