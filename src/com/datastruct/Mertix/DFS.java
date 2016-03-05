package com.datastruct.Mertix;

/**
 * 深度优先搜索
 *非递归实现法
 *首先访问该顶点，然后将其放入栈中，最后标记该顶点
 *规则1：访问一个邻接的未访问过的顶点，标记它，并放入栈中
 *规则2：当不能执行规则1时，如果栈不为空，则弹出一个顶点
 *规则3：若不能执行规则1和规则2，则完成整个搜索
 * @author huangxw
 *
 */
public class DFS {
	
	public static void main(String[] args) {
		
		Graph graph = new Graph();
		graph.reset();
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addVertex('F');
		
		
		graph.addEage('A', 'B');
		graph.addEage('D', 'B');
		graph.addEage('B', 'E');
		graph.addEage('A', 'C');
		graph.addEage('C', 'F');
		


		
		System.out.println("visitor:");
		graph.DFS();

		

	}
	
	
}
