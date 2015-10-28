package com.Mertix;

/**
 * �����������
 *�ǵݹ�ʵ�ַ�
 *���ȷ��ʸö��㣬Ȼ�������ջ�У�����Ǹö���
 *����1������һ���ڽӵ�δ���ʹ��Ķ��㣬�������������ջ��
 *����2��������ִ�й���1ʱ�����ջ��Ϊ�գ��򵯳�һ������
 *����3��������ִ�й���1�͹���2���������������
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
