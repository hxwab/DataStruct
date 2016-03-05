package com.datastruct.Mertix;

/**
 * 有向图的连通性：拓扑排序
 * 算法思想：
 * 1.找到一个没有后继的顶点
 * 2.从图中删除顶点，然后在列表中加入该删除的顶点
 *  重复步骤1和步骤2，直到所有的顶点都从图中删除，这时列表的顶点顺序就是拓扑排序的结果
 * 
 * 
 * 关于删除顶点，有两种做法
 * 1、直接在图中删除该顶点所对应的行和列，这样涉及到数组元素的移动，但在找后继节点时只要全0就行
 * 2、在图中把该顶点所对应的行和列置0，且置该顶点的wasVisited为ture,但在找后继顶点时需要加wasVisited为false
 * @author win7
 *
 */

public class Topo {

	public static void main(String[] args) {
		Graph g = new Graph();
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('D');
		g.addVertex('E');
		g.addVertex('F');
		g.addVertex('G');
		g.addVertex('H');
		
		g.addEageDir('A', 'D');
		g.addEageDir('A', 'E');
		g.addEageDir('B', 'E');
		g.addEageDir('C', 'F');
		g.addEageDir('D', 'G');
		g.addEageDir('E', 'G');
		g.addEageDir('F', 'H');
		g.addEageDir('G', 'H');
		
		g.topo();
		
	}
}
