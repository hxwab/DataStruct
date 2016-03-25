package com.newcode.link;


/**
 * 双向链表
 * @author admin
 *
 */
public class LinkList extends Link{
	
	private Node head;
	
	public Node insert(int val){
		
		Node node = new Node(val, head);
		node.addBefore(head);
		head = node;
		
		return head;
	}
	
	
	static class Node extends Link.Node{

		Node pre;
		 public Node(int value,Node next) {
				super(value,next);
			}
		 
		  private void addBefore(Node node) {
	            node.pre =node;
	        }
		 
	}
	

}
