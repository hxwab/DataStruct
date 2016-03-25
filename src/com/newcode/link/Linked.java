package com.newcode.link;



public class Linked extends AbstractLink {

	protected Node head;
	
	
	@Override
	public void insert(int val) {
		Node node = new Node(val, head);
		if(head!=null)
		   node.addBefore(head);
		head = node;
	}
	
	

	@Override
	public void delete(int val) {
		
		
	}
	
	static class Node extends AbstractLink.Node{

		Node pre;
		 public Node(int value,Node next) {
				super(value,next);
			}
		 
		  private void addBefore(Node node) {
	            node.pre =node;
	        }
		 
	}




}
