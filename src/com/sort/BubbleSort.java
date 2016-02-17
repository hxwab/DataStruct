package com.sort;

/**
 * 冒泡排序
 * @author csdc
 *
 */
public class BubbleSort extends Sort {

	@Override
	public void order(int[] a) {
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

}
