package com.newcode.tree;


public class Tree  implements ITree{
	
    private TreeNode root;
    
    /**
     * 插入
     * @param node
     */
    
    public void insert(TreeNode node){
    	
    	if(root==null){
    		root = node;
    		return ;
    	}
    	
    	TreeNode curr = root;
    	TreeNode  parent =null ;
    	while(curr!=null){
    		parent = curr;
    		if(curr.val<node.val){
    			curr = curr.right;
    		}else{
    			curr = curr.left;
    		}
    	}
    	
    	if(parent.val<node.val)
    		parent.right=node;
    	else
    		parent.left = node;
    	
    }
    
    
    public void insert(int val){
    	
    	TreeNode node =new TreeNode(val);
    	if(root==null){
    		root = node;
    		return ;
    	}
    	
    	TreeNode curr = root;
    	TreeNode  parent =null ;
    	while(curr!=null){
    		parent = curr;
    		if(curr.val<node.val){
    			curr = curr.right;
    		}else{
    			curr = curr.left;
    		}
    	}
    	
    	if(parent.val<node.val)
    		parent.right=node;
    	else
    		parent.left = node;
    }
    
    
    
     public TreeNode getRoot() {
		return root;
	}




	static class TreeNode{
    	int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }




	@Override
	public boolean isBalance(TreeNode root) {
		int sub = getDepth(root)-getMinHeight(root);
		return sub<=1;
	}


	@Override
	public int getDepth(TreeNode root) {
		int treeDepth =TreeUtil.getTreeDeep(root);
		return treeDepth;
	}


	@Override
	public int getMinHeight(TreeNode root) {
		return TreeUtil.getMinDepth(root);
	}
}
