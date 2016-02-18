package com.sort;
/**
 * 插入排序法，取出比较移位插入
 * @author csdc
 *
 */
public class InsertSort extends Sort {

	@Override
	public void order(int[] a) {
		int temp;
		int index ;
		for(int i= 0;i<a.length;i++){
			index = i;
			temp = a[index];
			for(int j=i;j>=0;j--){
				if(temp<a[j]){
					a[index--]=a[j];
				}
			}
			a[index]=temp;
		}

	}

}
