package com.Mertix;

import com.queue.Queue;

/**
 * 
 * * ��ʾͼ�����ַ���(���������)
 * 1.�ڽӾ���
 *   A B C D
 * A 0 1 0 1     A--B--C
 * B 1 0 1 1     | /
 * C 0 1 0 0     D
 * D 1 1 0 0
 * 2.�ڽӱ�
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
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int nVerts;
	private Queue theQueue;
	
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
	
	public void addVertex(char lable){
		vertexList[nVerts++] = new Vertex(lable);
	}
	
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
	
	
	public void DFS(){
		
		StackV stack = new StackV();
		char temp;
		
		//ȡ����Ԫ�ر�ǲ�ѹ��ջ��
		vertexList[0].wasVisited=true;
		temp = vertexList[0].lable;
		displayVertex(0);
		stack.push(temp);
		
		while(!stack.isEmpty()){
			//��ȡ�ڽ�δ���ʵĶ���
			char lab = getAdjUnvisitedVertex(stack.peek());
			if(lab=='0'){//û��δ���ʵ��ڽӶ��㣬�򵯳�ջ��Ԫ��
				stack.pop();
			} else {//��δ���ʵ��ڽӶ������ǲ�ѹ��ջ��
				vertexList[lab-'A'].wasVisited=true;
				displayVertex(lab-'A');
				stack.push(lab);
			}
		}
	}
	
	/**
	 * ˫��ѭ��
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
	            char v1=(Character) theQueue.remove();//û��δ���ʵ��ڽӵĵ�ʱ�����ӣ����ڵ�ֱ�ӳ��ӣ�
	            while((v2=getAdjUnvisitedVertex(v1))!='0'){//���ҳ��ӽڵ��δ���ʵ��ڽӵ㣬�����
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
<<<<<<< HEAD
	
	
=======
	  
	  
	  
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
>>>>>>> origin/master
	
}
