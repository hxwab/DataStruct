package com.newcode;
/**
 * 请编写一个算法，若MxN矩阵中某个元素为0，则将其所在的行与列清零。
给定一个MxN的int[][]矩阵(C++中为vector>)mat和矩阵的阶数n，请返回完成操作后的int[][]矩阵(C++中为vector>)，
保证n小于等于300，矩阵中的元素为int范围内。
 * @author csdc
 *
 *解题思路：
 *1、首先看到题目时，是想增加存放标志位的数组来标识是否为矩阵中原来的0
 *2、直接提取出包含0的行和列，最后一起处理
 */
public class Clear {
	
	
	private int[][] mat ={{0,0,1},{0,1,2},{1,2,3}};
	int n=3;
	
	public static void main(String[] args) {
		Clear c = new Clear();
		c.test();
		c.display();
	}
	public void test(){
		clearZero(mat, n);
	}
	
	
	public void clearZero(int[][] mat) {
		
		boolean [] xMat = new boolean[n];
		boolean [] yMat = new boolean[n];
		
	}
	
	
	public int[][] clearZero(int[][] mat, int n) {
		boolean [][] flag = new boolean[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(mat[i][j]==0)
				flag[i][j]=true;
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(mat[i][j]==0&&flag[i][j]){
					
					for(int p=0;p<n;p++){
						mat[i][p]=0;
						mat[p][j]=0;
					}
				}
			}
		}
		return mat;
		
    }
	
	public void display(){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();
		}
	}

	
}
