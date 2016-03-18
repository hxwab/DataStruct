package com.newcode.tree;

import com.newcode.tree.Tree.TreeNode;

public class TreeUtil  extends AbstractTree {
	
	
	Tree tree;
	
	
	
	
	
	
	
	
	
	
	
	
	public int getTreeDeep(TreeNode root){
		
		if(root ==null) return 0;
		
		int right = getTreeDeep(root.right);
		int left = getTreeDeep(root.left);
		
		return left>right?left:right;
		
	}












	@Override
	public void pre_order(TreeNode root) {
		// TODO Auto-generated method stub
		
	}












	@Override
	public void in_order(TreeNode root) {
		// TODO Auto-generated method stub
		
	}












	@Override
	public void post_order(TreeNode root) {
		// TODO Auto-generated method stub
		
	}












	@Override
	public int getLeafNum(TreeNode root) {
		// TODO Auto-generated method stub
		return 0;
	}











   //获得树的高度
	@Override
	public int getTreeHeight(TreeNode root) {
		
		if(root==null) return 0;
		
		int right = getTreeHeight(root.right);
		int left = getTreeHeight(root.left);
		
		return Math.max(right, left);
	}












	@Override
	public void swapLeftRight(TreeNode root) {
		// TODO Auto-generated method stub
		
	}












	@Override
	public void printRout(TreeNode root, int sum) {
		// TODO Auto-generated method stub
		
	}












	@Override
	public boolean isInTree(TreeNode root, TreeNode node) {
		// TODO Auto-generated method stub
		return false;
	}












	@Override
	public int getMaxWidth(TreeNode root) {
		// TODO Auto-generated method stub
		return 0;
	}












	@Override
	public void mirrorTree(TreeNode root) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
