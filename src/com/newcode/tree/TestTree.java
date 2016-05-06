package com.newcode.tree;

import com.newcode.tree.Tree.TreeNode;

public class TestTree {
	
	
	public static void main(String [] args){
		
		TestTree test = new TestTree();
		test.testFindAndIsSubTree();
	}
	
	
	
	public void  testFindAndIsSubTree(){
		
		TreeNode root1 = bulidTree(new Tree(),new int[]{1,2,3,4});
		TreeNode root2 = bulidTree(new Tree(), new int[]{1,2,3});
		
		TreeUtil treeUtil = new TreeUtil();
		
		
		System.out.println(treeUtil.find(root1, root2));

		System.out.println(treeUtil.isSubTree(root1, root2));
		
	}
	
	
	public TreeNode bulidTree(Tree tree,int [] array){
		
		for(int val :array){
			tree.insert(val);
		}
		
		return tree.getRoot();
	}
	
	

}
