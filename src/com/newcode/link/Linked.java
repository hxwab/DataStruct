package com.newcode.link;



public class Linked extends Link {

	protected Node tail;
	
	
	@Override
	public Node insert(int val) {
		Node node = new Node(val, head);
		if(head!=null)
		   node.addBefore(head);
		head = node;
	}
	
	

	@Override
	public void delete(int val) {
		
		
	}
	
	private static class Node extends Link.Node{

		Node pre;
		 public Node(int value,Link.Node next) {
				super(value,next);
			}
		 
		  private void addBefore(Node node) {
	            node.pre =this;
	        }
		 
	}




}
