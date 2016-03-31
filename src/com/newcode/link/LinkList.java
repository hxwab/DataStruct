package com.newcode.link;


/**
 * 双向链表
 * @author admin
 *
 */
public class LinkList extends AbstractLink{
	
	//protected Node head;
	private Node tail;
	
	public void insert(int val){
		
		Node node = new Node(val, head);
		if(head!=null)
		   node.addBefore(head);
		else tail =node;
		head = node;
		
	}
	
	
	@Override
	public void delete(int val) {
		
		
		
	}
	
	
	
	public void delete(int val , String str){
	}
	
	public void revert(){
		Node curr=tail;
		while(curr!=null){
			System.out.print(curr.vaule+" ");
			curr=curr.pre;
		}
		System.out.println();
		
	}
	
	
	static class Node extends AbstractLink.Node{

		Node pre;
		 public Node(int value,Node next) {
				super(value,next);
			}
		 
		  private void addBefore(Node node) {
	            node.pre =this;
	        }
		 
	}


	
	

}
