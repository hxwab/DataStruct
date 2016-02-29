package com.datastruct.sort;
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
	
	public void order1(int[] a) {
		int temp;
		int index ;
		for(int i= 1;i<a.length;i++){
			index = i;
			temp = a[index];
			while(index>0&&temp<a[index-1]){
				a[index]=a[index-1];
				index--;
			}
			a[index]=temp;
		}

	}

}
