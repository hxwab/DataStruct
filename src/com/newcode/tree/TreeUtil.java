package com.newcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.newcode.tree.Tree.TreeNode;

public class TreeUtil  extends AbstractTree {
	
	
	Tree tree;
	
	
	
	
	
	
	public  static int getTreeDeep(TreeNode root){
		
		if(root ==null) return 0;
		
		int right = getTreeDeep(root.right);
		int left = getTreeDeep(root.left);
		
		return left>right?(left+1):(right+1);
		
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
		
		return Math.max(right+1, left+1);
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





	
	
	/**
	 * 层次遍历，使用队列先入根节点，弹出。压入左右节点，弹出再压入其左右节点
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
	




//二叉树的镜像http://blog.csdn.net/yuzhongchun/article/details/39697729 根据画图可得到这样的思路：先序遍历树的每个结点，若遍历到的结点有子结点，则交换它的两个子结点。
	//交换左右节点，依次递归;
	@Override
	public void mirrorTree(TreeNode root) {
		
		if(root==null)  return ;
		
		if(root.left==null&&root.right==null) return ;
		
		//交换左右子树
		TreeNode temp = root.right;
		root.right = root.left;
		root.left = temp;

		if(root.left!=null)
			 mirrorTree(root.left);
		if(root.right!=null)
			mirrorTree(root.right);
	}
	
	
	public void mirror(TreeNode root){
		
		
		
	}
	
	
	
	

}
