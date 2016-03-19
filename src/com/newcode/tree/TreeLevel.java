package com.newcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.newcode.tree.Tree.TreeNode;
/**
 * 树的层级遍历
 */
public class TreeLevel {
	
	
	
	/**
	 * 层次遍历，使用队列先入根节点，弹出。压入其左右子节点，逐一弹出再压入其左右子节点
	 * @param root
	 */
	public void levelTrace(TreeNode root){
		
		
		if(root==null) return ;
		List<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		
		queue.add(root);
		TreeNode node ;
		
		while(!queue.isEmpty()){
			node =queue.poll();
			list.add(node.val);
			if(node.left!=null)
				queue.add(node.left);
			if(node.right!=null)
				queue.add(node.right);
		}
		
	   for(Iterator<Integer> it =list.iterator();it.hasNext();){
		   System.out.print( it.next() +" ");
	   }
	}

	
	
/**
 * 层级遍历，打印出每一层（按层打印）
 * @param root
 */
	public void levelPrint(TreeNode root){
		
		if(root==null) return ;
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		
		queue.add(root);
		TreeNode node ;
		int childSize=0;
		int parentSize =1;
		while(!queue.isEmpty()){
			node =queue.poll();
			System.out.println(node.val+" ");
			if(node.left!=null){
				queue.add(node.left);
				childSize++;
			}
			
			if(node.right!=null){
				queue.add(node.right);
				childSize++;
			}
			
			parentSize--;
			if(parentSize==0){
				parentSize =childSize;
				childSize =0;
				System.out.println();
			}
		}
	}
	
	
	//树的右视图,先层次遍历，每一层标记节点的个数。去每一层的最后节点
	
	public void rightSideView(TreeNode root){
		
		if(root==null) return ;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.add(root);
		TreeNode node ;
		int childSize=0;
		int parentSize =1;
		while(!queue.isEmpty()){
			node =queue.poll();
			if(node.left!=null){
				queue.add(node.left);
				childSize++;
			}
			
			if(node.right!=null){
				queue.add(node.right);
				childSize++;
			}
			
			parentSize--;
			if(parentSize==0){
				parentSize =childSize;
				childSize =0;
				System.out.println(node.val);
			}
		}
	}
	
	
	/**
	 * 采用DFS
	 * @param root
	 */
	public void rightSideView1(TreeNode root){
		
		
	}
	
	
	
	

}
