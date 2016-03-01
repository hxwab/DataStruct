package com.newcode.link;
/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * http://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author csdc
 *
 */
public class LinkMerge {

	public static void main(String[] args) {
		new LinkMerge().test();
	}
	
	public void test(){
		ListNode l1 = new ListNode(1);
		ListNode t = new ListNode(3);
		l1.next=t;
		t.next= new ListNode(5);
		display(l1);
		
		ListNode l2 = new ListNode(2);
		t = new ListNode(4);
		l2.next=t;
		t.next = new ListNode(7);
		display(l2);
		
		//display(Merge(l1, l2));
		display(Merge1(l2, l1));
		display(l2);
		display(l1);
	}
	
	/**
	 * 非递归，较容易理解
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode Merge(ListNode list1,ListNode list2) {
		
		ListNode head =null;
		if(list1==null) return list2;
		if(list2 == null) return list1;
		
		if(list1.value<=list2.value){
			head = list1;
			list1 = list1.next;
		}else {
			head = list2;
			list2 = list2.next;
		}
		ListNode t =head;
		
		while(list1!=null&&list2!=null)	{
			if(list1.value<=list2.value){
				t.next = list1;
				list1= list1.next;
			} else {
				t.next =list2;
				list2 = list2.next;
			}
			t = t.next;
		}
		
		if(list1!=null){
			t.next=list1;
		}
		if(list2!=null){
			t.next = list2;
		}
		
		return head;
        
    }
	
	/**
	 * 递归,链表长的话，递归层数太深，容易造成栈溢出
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode Merge1(ListNode list1,ListNode list2){
		
		if(list1==null) return list2;
		if(list2 ==null) return list1;
		
		ListNode list ;
		if(list1.value<=list2.value){
			list = list1;
			list.next = Merge1(list1.next, list2);
		}else {
			list = list2;
			list.next = Merge1(list1, list2.next);
		}
		
		return list;
	}
	
	
	
	
	public void display(ListNode node){
		while(node!=null){
			System.out.print( node.value + "  ");
			node = node.next;
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	class ListNode {
		int value;
		ListNode next = null;
		public ListNode(int value) {
			this.value = value;
		}
	}
	
}
