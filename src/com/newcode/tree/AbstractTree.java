package com.newcode.tree;

import com.newcode.tree.Tree.TreeNode;

public  abstract class  AbstractTree {
	
	/**
	 * 前序遍历
	 * @param root
	 */
	public abstract void pre_order(TreeNode root);
	
	
	/**
	 * 中序遍历
	 * @param root
	 */
	public abstract void in_order(TreeNode root);
	
	/**
	 * 后序遍历
	 * @param root
	 */
	public abstract void post_order(TreeNode root);
	
	/**
	 * 获得叶子节点的个数
	 * @param root
	 * @return
	 */
	
	public abstract int getLeafNum(TreeNode root);
	
	/**
	 * 获得树的高度
	 * @param root
	 * @return
	 */
	public abstract int getTreeHeight(TreeNode root);
	
	/**
	 * 交换左右节点
	 * @param root
	 */
	public abstract void swapLeftRight(TreeNode root);
	
	/**
	 * 找出和为num的路径
	 * @param root
	 * @param sum
	 */
	public abstract void printRout(TreeNode root ,int sum);
	
	/**
	 * 判断节点node，是否在以root为根的子树中
	 * @param root
	 * @param node
	 * @return
	 */
	public abstract boolean isInTree(TreeNode root , TreeNode node);
	
	
	/**
	 * 树的宽度
	 * @param root
	 * @return
	 */
	public abstract  int getMaxWidth(TreeNode root) ;
	
	
	/**
	 * 二叉树镜像
	 * @param root
	 */
	public abstract void mirrorTree(TreeNode root);
	
	/**
	 *  将二叉查找树变为有序的双向链表
	 * @return
	 */
	public abstract TreeNode tree2Link(TreeNode root);
	
	
	/**
	 * 求二叉树第K层的节点个数
	 * @param root
	 * @return
	 */
	public abstract int getKLevelNodeNum(TreeNode root);
	
	/*
	 * 判断两棵二叉树是否结构相同
	 * 
	 */
	public abstract boolean isSmilarity(TreeNode root1,TreeNode root2);
	
	
	/**
	 * 求二叉树中两个节点的最低公共祖先节点
	 * @param node1
	 * @param node2
	 * @return
	 */
	public abstract TreeNode LCA(TreeNode node1,TreeNode node2);
	
	
	/**
	 * 求二叉树中节点的最大距离
	 * @param node1
	 * @param node2
	 * @return
	 */
	public abstract int getMaxDistance(TreeNode node1,TreeNode node2);
	
	/**
	 * 由前序遍历序列和中序遍历序列重建二叉树
	 * @param preRoot1
	 * @param afRoot2
	 * @return
	 */
	public abstract TreeNode rebulid(TreeNode preRoot1,TreeNode afRoot2);
	
	
	/**
	 * 判断二叉树是不是完全二叉树
	 * @param root
	 * @return
	 */
	public abstract boolean isPrefectTree(TreeNode root);
	
	
	/**
	 * 有问题？？
	 * 
	 * 判断两个二叉树是否是子树
	 * @param root1
	 * @param root2
	 * @return
	 */
	public  boolean isSubTree(TreeNode root1,TreeNode root2){
		boolean result=false;
		
		if(root1==null||root2==null) return true;
		
		TreeNode nodeIn1 =find(root1,root2);
		if(nodeIn1==null) return false;
		
			result = isSubTree(nodeIn1.left,root2.left)&&isSubTree(nodeIn1.right,root2.right);
		
		return result;
		
	}
	
	
	public boolean isEqualTree(TreeNode root1,TreeNode root2){
		
		return true;
	}
	
	
	public TreeNode find(TreeNode root1,TreeNode root2){
		
		if(root1==null||root2==null) return null;
		
		if(root1.val==root2.val) return root1;
		TreeNode left =find(root1.left,root2);
		TreeNode right=find(root1.right,root2);
		
		return left!=null?left:right;
		
	}
	
	/**
	 * 
	 * 
	 * 
	 * 1. 求二叉树中的节点个数 //遍历
2. 求二叉树的深度
3. 前序遍历，中序遍历，后序遍历
4.分层遍历二叉树（按层次从上往下，从左往右）
5. 将二叉查找树变为有序的双向链表
6. 求二叉树第K层的节点个数
7. 求二叉树中叶子节点的个数
8. 判断两棵二叉树是否结构相同
9. 判断二叉树是不是平衡二叉树
10. 求二叉树的镜像
11. 求二叉树中两个节点的最低公共祖先节点
12. 求二叉树中节点的最大距离
13. 由前序遍历序列和中序遍历序列重建二叉树
14.判断二叉树是不是完全二叉树
15.判断两个二叉树是否是子树
	 */

}
