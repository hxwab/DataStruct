package com.datastruct.Mertix;
/**
 * 传递闭包,减少多步路径的判断
 * 如果能从顶点L到M，并且能从顶点M到N,那么可以从L到M
 * 算法思想:
 * 1.第一层循环控制行--->i
 * 2.第二层循环控制列--->j，若（i，j）=1，则执行第三层循环
 * 3.第三层循环，找（k，i）=1，若有则令（k,j）=1
 * @author win7
 *
 */
public class Warshall {
	
	
	
	public static void main(String[] args) {
		
		Warshall ws = new Warshall();
		Graph graph = new Graph();
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		
		graph.addEageDir('A', 'C');
		graph.addEageDir('B', 'A');
		graph.addEageDir('B', 'E');
		graph.addEageDir('D', 'E');
		graph.addEageDir('E', 'C');
		
		//ws.warshall1(graph.getAdjMat(), graph.getnVerts());
		ws.warshall1(graph.getAdjMat(), graph.getnVerts());

		graph.displayGraph();
	}
	
	
	public int[][] warshall(int[][] adjMat,int size){
		
		for(int i = 0; i<size;i++){
			
			for(int j = 0; j<size ;j++){
				
				if(adjMat[i][j]==1){
					
					for(int k =0; k<size ;k++){
						
						if(adjMat[k][i]==1){
							adjMat[k][j]=1;
						}
					}
				}
			}
		}
		
		return adjMat;
	}
	
	
	public void warshall1(int[][] adjMat,int size){
		
		for(int i = 0; i<size;i++){
			
			for(int j = 0; j<size ;j++){
				
				if(adjMat[i][j]==1){
					
					for(int k =0; k<size ;k++){
						
						if(adjMat[k][i]==1){
							adjMat[k][j]=1;
						}
					}
				}
			}
		}
	}
}
