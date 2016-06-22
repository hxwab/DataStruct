package com.newcode.tree;

import com.newcode.tree.Tree.TreeNode;

public interface ITree {
	
	public void insert(TreeNode node);
	
	public void delete(TreeNode node);
	
	public boolean isTreeNode(int  val);
	
	
	
	public boolean isBalance(TreeNode root);
	
	public int getDepth(TreeNode root);
	
	public int getMinHeight(TreeNode root);

}
