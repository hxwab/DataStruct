package com.Mertix;

import com.queue.Queue;

/**
 * 
 * * 表示图的两种方法(单向和有向)
 * 1.邻接矩阵
 *   A B C D
 * A 0 1 0 1     A--B--C
 * B 1 0 1 1     | /
 * C 0 1 0 0     D
 * D 1 1 0 0
 * 2.邻接表
 *  
 * A   B-C-D
 * B   A-C-D
 * C   B
 * D   A-B
 * @author huangxw
 *
 */
public class Graph {
	
	private final int MAX_VERTS = 10;
	private Vertex[] vertexList;  //存放顶点信息
	private int[][] adjMat;    //存放图
	private int nVerts;   // 节点个数
	private Queue theQueue;  //队列
	private char[] sortChar;  //有向图拓扑排序

	
	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int i =0; i<MAX_VERTS;i++){
			for(int j= 0 ;j<MAX_VERTS;j++){
				adjMat[i][j]=0;
			}
		}
	}
	
	public void reset(){
		for(int j=0;j<nVerts;j++)
			vertexList[j].wasVisited=false;
	}
	
        /**
	 * 加入顶点
	 * @param lable
	 */
	public void addVertex(char lable){
		vertexList[nVerts++] = new Vertex(lable);
	}

        /**
	 * 加入无向图的边,对角阵
	 * @param lable1
	 * @param lable2
	 */
	
	public void addEage(char lable1 ,char lable2){
		adjMat[lable1-'A'][lable2-'A']=1;
		adjMat[lable2-'A'][lable1-'A']=1;
	}
	
	
	public char getAdjUnvisitedVertex(char lable){
		for(int j=0;j<nVerts;j++){
			if(adjMat[lable-'A'][j]==1 && !vertexList[j].wasVisited  )
				return (char)('A'+j);
		}
		return '0';
		
	}

	public char getAdjNextVertex(char lable){
		for(int j=0;j<nVerts;j++){
			if(adjMat[lable-'A'][j]==1){
				adjMat[lable-'A'][j]=0;
				return (char)('A'+j);
			}
		}
		return '0';
		
	}
	
	
	public void displayVertex(int v){
		System.out.println(vertexList[v].lable);
	}
	
	public void  displayGraph() {
		for(int i = 0; i<nVerts;i++){
			for(int j=0;j<nVerts;j++)
				System.out.print(adjMat[i][j]+" ");
				System.out.println("");
		}
		
	}
	
	/**
	 * 递归调用
	 * 1、访问顶点v并置标识为true
	 * 2、w=v的第一个邻接点
	 * 3、while(w存在){
	 *   if(w未被访问){
	 *     DFS(W);
	 *   }else{
	 *   	w=顶点V的下一个邻接点
	 *   }
	 *    
	 * }
	 * @param lab
	 */
	public void DFS(char lab){
		
		vertexList[lab-'A'].wasVisited=true;
		displayVertex(lab-'A');
		char next = getAdjNextVertex(lab);
		while(next!='0'){
			if(!vertexList[next-'A'].wasVisited){
				DFS(next);
			} else{
				next =getAdjNextVertex(lab);
			}
		}
		
	}
	
	//非递归方法
	public void DFS(){
		
		StackV stack = new StackV();
		char temp;
		
		//取顶点元素标记并压入栈中
		vertexList[0].wasVisited=true;
		temp = vertexList[0].lable;
		displayVertex(0);
		stack.push(temp);
		
		while(!stack.isEmpty()){
			//获取邻接未访问的顶点
			char lab = getAdjUnvisitedVertex(stack.peek());
			if(lab=='0'){//没有未访问的邻接顶点，则弹出栈顶元素
				stack.pop();
			} else {//有未访问的邻接顶点则标记并压入栈中
				vertexList[lab-'A'].wasVisited=true;
				displayVertex(lab-'A');
				stack.push(lab);
			}
		}
	}
	
	/**
	 * 双重循环
	 */
	  public void BFS(){
		  
		  	theQueue = new Queue<Character>(10);
		  	char temp ;
	        vertexList[0].wasVisited=true;
	        temp=vertexList[0].lable;
	        displayVertex(0);
	       
				try {
					theQueue.insert(temp);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
	        char v2;
	        while(!theQueue.isEmpty()){
	            char v1=(Character) theQueue.remove();//没有未访问的邻接的点时，出队（根节点直接出队）
	            while((v2=getAdjUnvisitedVertex(v1))!='0'){//查找出队节点的未访问的邻接点，并入队
	                vertexList[v2-'A'].wasVisited=true;
	                displayVertex(v2-'A');
	                try {
						theQueue.insert(v2);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        }
	      
	    }
	  
	  
	  
	  public void mst(){
		  
		  StackV stack = new StackV();
		  char currentLable = vertexList[0].lable;
		  vertexList[0].wasVisited= true;
		  //displayVertex(0);
		  stack.push(currentLable);
		  
		  
		  while(!stack.isEmpty()){
			  currentLable = stack.peek();
			  char lab = getAdjUnvisitedVertex(currentLable);
			  if(lab=='0'){
				  stack.pop();
			  } else {
				  
				   vertexList[lab-'A'].wasVisited=true;
				   stack.push(lab);
				   displayVertex(currentLable-'A');
				   displayVertex(lab-'A');
				   System.out.println("****");
				  
			  }
			  
		  }
		  
	  }

	
}
