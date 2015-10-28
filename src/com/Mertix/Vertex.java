package com.Mertix;

public class Vertex {
	
	public char lable; //节点
	public boolean wasVisited;//是否访问过的标志
	
	public Vertex(char lable) {
		super();
		this.lable = lable;
		this.wasVisited = false;
	}
}
