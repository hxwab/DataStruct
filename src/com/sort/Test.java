package com.sort;

public class Test {
	
	public static void main(String[] args) {
		
		int [] array = new int[]{3,5, 2,4 ,1};
		Sort sort ;
		sort = new BubbleSort();
		sort = new SelectSort();
		sort = new InsertSort();
		sort = new QuickSort();
		sort = new MergeSort();
		sort.sort(array);
	}

}
