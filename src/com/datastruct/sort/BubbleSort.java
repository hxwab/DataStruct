package com.datastruct.sort;

/**
 * 冒泡排序:1.比较相邻元素大小 2.交换
 * 比较和比较均为n^2
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
		
		/*int  out ;
		int in;
		
		for(out = a.length-1;out>1;out--){
			for(in = 0;in<out;in++){
				if(a[in]>a[in+1]){
					swap(a, in, in+1);
				}
			}
		}*/
	}
	

}
