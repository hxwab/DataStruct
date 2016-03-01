package com.newcode.tree;


public class Tree {
	
    private TreeNode root;
    
    
    
    public void insert(TreeNode node){
    	
    	if(root==null){
    		root = node;
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
}
