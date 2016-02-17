package com.sort;

/**
 * 冒泡排序:1.比较相邻元素大小 2.交换
 * @author csdc
 *
 */
public class BubbleSort extends Sort {

	public void order1(int[] a) {
		for(int i=0; i<a.length;i++){
			int index =0;//最大值
			for(int j=0;j<a.length-i;j++){
				if(a[index]>a[j]){
					swap(a, index, j);
				}
				index = j;//更新最大值索引
			}
		}
		
	}
	
	public void order(int[] a) {
		for(int i=0; i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					swap(a, j, j+1);
				}
			}
		}
		
	}
	

}
