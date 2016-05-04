package com.newcode.tree;

import com.newcode.tree.Tree.TreeNode;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author csdc
 *同层打印用队列
 */
public class PrintTree {

	
	private  static Tree tree = new Tree();
	
	public static void main(String[] args) {
		tree.insert(1);
		tree.insert(new TreeNode(2));
		tree.insert(new TreeNode(3));
		tree.insert(new TreeNode(4));
		
		PrintTree pt = new PrintTree();
		pt.print(tree.getRoot());
		
	}
	
	
	public void print(TreeNode root){
		
		if(root==null) return;
		
		System.out.print(root.val +" ");
		if(root.left!=null){
			System.out.print(root.left.val+" ");
			print(root.left);
		}
		
		if(root.right!=null){
			System.out.print(root.right.val+" ");
			print(root.right);
		}
		
		return ;
		
	}
	
	
	
	
}
