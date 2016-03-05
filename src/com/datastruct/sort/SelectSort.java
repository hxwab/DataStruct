package com.datastruct.sort;
/**
 * 选择排序法：1、找到最小的，排在首位。次小的排在后位
 * 比较n^2 ，交换n
 * @author csdc
 *
 */
public class SelectSort extends Sort {

	public void order(int[] a) {

		int minIndex;
		for(int i=0;i<a.length;i++){
			minIndex = getMinIndex(a,i);
			swap(a, i, minIndex);
		}
		
	}
	
	public void order1(int[] a) {

		int minIndex;
		for(int i=0;i<a.length;i++){
			minIndex=i;
			for(int j=i;j<a.length;j++){
				if(a[minIndex]>a[j]){
					minIndex=j;
				}
			}
			swap(a, i, minIndex);
		}
		
	}

}
