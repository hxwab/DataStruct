package com.newcode.link;

import java.util.Random;
import com.newcode.link.Link.Node;

/**
 * 获取链表的中间元素，若有偶数个则取前面的那一个
 * 思想：快慢指针，时间复杂度o(N)
 *   
 */
public class FindMid {

	private static Link  link = new Link() ;
	
	public static void main(String[] args) {
		
		FindMid f =new FindMid();
		f.creat();
		/*link.display();
		System.out.println(f.getMid());
		link.delete(0,null);
		link.display();*/
		
		LinkList list = new LinkList();
		f.creat(list, 10);
		list.display(list.head);
		list.revert();
		
		com.newcode.link.LinkList.Node [] node = list.findNode(10);
		System.out.println(node[0].vaule + " " +node[1].vaule);
		
	}
	
	
	public int getMid(){
		Node fast =link.getFirstNode() ;
		Node slow = link.getFirstNode();
		
		while(true){
			fast = fast.next;
			if(fast==null) break;
			fast =fast.next;
			if (fast==null) break;
			slow = slow.next;
		}
		return slow.vaule;
	}
	
	public void creat(LinkList  list,int num){
		Random r =new Random();
		for(int i=0;i<num;i++){
			list.insert(r.nextInt(50));
		}
	}
	
	/**
	 * 随机生成链表
	 */
	public void creat(){
		Random r = new Random();
		for(int i=0;i<9;i++){
			link.insert(r.nextInt(50));
		}
	}
}
