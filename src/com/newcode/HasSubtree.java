package com.newcode;
/**
 * 输入两颗二叉树A，B，判断B是不是A的子结构。
 * @author csdc
 *思想：在A中找B的根节点，若存在，则从该节点开始逐一对比子节点
 *第一步在树A中找到和B的根节点的值一样的结点R；
 *第二步再判断树A中以R为根结点的子树是不是包含和树B一样的结构。
 *http://www.cnblogs.com/heyonggang/archive/2013/11/03/3405482.html
 */
public class HasSubtree {
	
	
	
	public TreeNode findTheSameNode(TreeNode root1 , TreeNode root2){
		TreeNode  node= null;
		if(root1==null||root2==null){
			return null;
		}
		if(root1.val==root2.val){
			node =root1;
		}
		
		if(node==null)
		node=findTheSameNode(root1.right, root2);
		
		if(node ==null)
		node =findTheSameNode(root1.left, root2);
		
		return node;
	}
	
	public boolean hasSubTree(TreeNode root1 , TreeNode root2){
		boolean result = false;
		
		if(root1==null||root2==null){
			return false;
		}
		//根节点相同，判断子节点。若是子树，则返回true，结束。否则在root1的子节点中找
		if(root1.val==root2.val){
			result = isSubtree(root1, root2);
		}
		//不同，则在右节点中找与root2相同的节点
		if(!result){
			result = hasSubTree(root1.right, root2);
		}
		//不同，则在左节点中找与root2相同的节点
		if(!result){
			result = hasSubTree(root1.left, root2);
		}
		
		return result;
	}
	
	//root2是否是root1的子树
	public  boolean isSubtree(TreeNode root1 , TreeNode root2){
		if(root2==null){
			return true;
		}
		
		if(root1==null){
			return false;
		}
		
		if(root1.val!=root2.val)
			return false;
		
		return isSubtree(root1.left, root2.left)&&isSubtree(root1.right, root2.right);
	}
	
	
	 class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}

}
