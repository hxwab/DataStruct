
package com.leetcode;
/**
 *http://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 *链表反转
 
 一定要考虑全面，head为空的情况
 
 t(前) head pNext（后）
 */
 
 
 
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        
         if(head==null){
	        	return head;
	        }
		 
	        ListNode t = null;
	        ListNode p= head;
	        ListNode pNext=head.next;
	       
	        
	       
	        if(head.next==null){
	            return head;
	        }
	        
	        while(pNext!=null){
	           t = p;
	           p =pNext;
	           pNext = pNext.next;
	           p.next=t;
	        }
	        head.next = null;
	        
	        return p;
	       
       
    }
}
