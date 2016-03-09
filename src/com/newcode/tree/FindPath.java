package com.newcode.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

import com.newcode.tree.Tree.TreeNode;

/**
 * 
 * @author csdc
 *
 */
public class FindPath {
	
	public static void main(String[] args) {
		
		try {
			
			Tree tree  = new Tree();
			
			tree.insert(new TreeNode(10));
			tree.insert(new TreeNode(5));
			tree.insert(new TreeNode(12));
			tree.insert(new TreeNode(2));
			tree.insert(new TreeNode(7));
			
			Stack<Integer> stack = new Stack<Integer>();
			
			new FindPath().findNPath(tree.getRoot(), 22, stack);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	
	public  void findNPath(TreeNode root ,int total ,Stack<Integer> stack){
		
		if(root==null)   return ;
 		stack.push(root.val);
		if(root.val==total) {
			print(stack);
			return ;
		}

		
		if(root.left!=null)
			findNPath(root.left, total-root.val, stack);
		if(root.right!=null)
			findNPath(root.right, total-root.val, stack);
		

		stack.pop();
		
		
		
	}
	
	public void print (Stack stack){
		Iterator it = stack.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}

	
	
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,
            int target) {
        ArrayList<ArrayList<Integer>> pathList=
                new ArrayList<ArrayList<Integer>>();
        if(root==null)
            return pathList;
        Stack<Integer> stack=new Stack<Integer>();
        FindPath(root,target,stack,pathList );
        return pathList;
         
    }
    private void FindPath(TreeNode root, int target,
            Stack<Integer> path,
            ArrayList<ArrayList<Integer>> pathList) {
        if(root==null)
            return;
        if(root.left==null&&root.right==null){
            if(root.val==target){
                ArrayList<Integer> list=
                        new ArrayList<Integer>();
                for(int i:path){
                    list.add(new Integer(i));
                }
                list.add(new Integer(root.val));
                pathList.add(list);
            }
        }
        else{
            path.push(new Integer(root.val));
            FindPath(root.left, target-root.val, path, pathList);
            FindPath(root.right, target-root.val, path,  pathList);
            path.pop();
        }
         
    }
}
