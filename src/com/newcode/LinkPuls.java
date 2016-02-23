package com.newcode;

public class LinkPuls {

	
	ListNode a;
	ListNode b;
	
	public static void main(String[] args) {
		new LinkPuls().test();
	}
	
	public void test(){
		ListNode t;
		a= new ListNode(0);
		t= new ListNode(1);
		a.next=t;
		b= new ListNode(1);
		t.next=b;
		
		b=new ListNode(0);
		display(a);
		display(b);
display(plusA(a, b));		
		
	}
	public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        Integer num =getNum(a)+getNum(b);
        String str = num.toString();
        ListNode head = new ListNode(str.charAt(0)-'0');
        ListNode tmp;
       for(int i=1;i<str.length();i++ ){
    	   tmp = new ListNode(str.charAt(i)-'0');
    	   tmp.next=head;
    	   head = tmp;
       }
       return head;
     }
	
	
	
	
	public int getNum(ListNode node){
		
		int num;
        StringBuffer s = new StringBuffer();
		while(node!=null){
			s.append(node.val);
			node=node.next;
		}
		num = Integer.parseInt(s.reverse().toString());
		return num;
	}
	
	
	public ListNode plusA(ListNode a, ListNode b) {
        // write code here
        Integer num =getNum1(a)+getNum1(b);
        ListNode head = new ListNode(num%10);
        ListNode tmp;
        ListNode pre=head;
       while(num/10!=0){
    	   num=num/10;
    	   tmp = new ListNode(num%10);
    	   pre.next=tmp;
    	   pre = tmp;
       }
       return head;
     }
	public int getNum1(ListNode node){
		
		int num=0;
		int pow =1;
       while(node!=null){
    	   num+=node.val*pow;
    	   pow*=10;
    	   node=node.next;
       }
       return num;
	}
	
	
	public void display(ListNode a){
		while(a!=null){
			System.out.print(a.val+"--");
			a= a.next;
		}
		System.out.println();
	}
	 class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
}
