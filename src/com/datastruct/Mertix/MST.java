package com.datastruct.Mertix;

public class MST {

	/**
	 * @param args
	 */
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
		graph.addEage('E', 'F');
		graph.addEage('C', 'B');
		graph.addEage('A', 'E');
		
		
		System.out.println("visitor:");
		graph.mst();

	}

}
