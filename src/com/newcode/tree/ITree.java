package com.newcode.tree;

import com.newcode.tree.Tree.TreeNode;

public interface ITree {
	
	public boolean isBalance(TreeNode root);
	
	public int getDepth(TreeNode root);
	
	public int getMinHeight(TreeNode root);

}
